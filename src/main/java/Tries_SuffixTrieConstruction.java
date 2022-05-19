import java.util.*;

/*

Write a SuffixTrie class for a Suffix-Trie-like data structure. The class should have a root
property set to be the root node of the trie and should support:
1. Creating the trie from a string; this will be done by calling the populateSuffixTrieFrom method
upon class instantiation, which should populate the root of the class.
2. Searching for strings in the trie.

Note that every string added to the trie should end with the special endSymbil character: "*".

If you're unfamiliar with Suffix Tries, we recommend watching the Conceptual Overview section of the
question's video explanation before starting to code.

Idea:
For populateSuffixTrieFrom method, use two for-loop to put the str into TrieNode,
then end on Key as * and value as null;
For contains method, use the for loop to check the str by each letters, if no contain return false.
Last, if no end with *, also return false;



*/


public class Tries_SuffixTrieConstruction {

    // Do not edit the class below except for the
    // populateSuffixTrieFrom and contains methods.
    // Feel free to add new properties and methods
    // to the class.
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            for(int i = 0; i < str.length(); i++){
                TrieNode node = root;
                for(int j = i; j < str.length(); j++){
                    if(!node.children.containsKey(str.charAt(j))){
                        TrieNode temp = new TrieNode();
                        node.children.put(str.charAt(j), temp);
                    }
                    node = node.children.get(str.charAt(j));
                }
                node.children.put(endSymbol, null);
            }
        }

        public boolean contains(String str) {
            TrieNode node = root;
            for(int i = 0; i < str.length(); i++){
                if(!node.children.containsKey(str.charAt(i)))
                    return false;
                node = node.children.get(str.charAt(i));
            }

            return node.children.containsKey(endSymbol);
        }
    }
}
