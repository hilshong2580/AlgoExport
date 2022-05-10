import java.util.*;

/*
Write a function that takes in an array of words and returns the smallest array of characters needed to form
all of the words. The characters don't need to be in any particular order.

For example, the characters ["y", "r", "o", "u"] are needed to form the words ["your", "you", "or", "yo"].
Note: the input words won't contain any spaces; however, they might contain punctuation and/or
special character.

words = ["this", "that", "did", "deed", "them!", "a"];
['t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'];

Idea:
Use the Map<Character, Integer> is the key point for this question.
Use the first Map to save the number of each letter, use second map to save each word's letter.
If The word's letter number large than the first map. update it.
Return it.

*/
public class Strings_MinimumCharactersForWords {

    public char[] minimumCharactersForWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for(String x : words){
            Map<Character, Integer> temp = new HashMap<>();

            for(int i = 0; i < x.length(); i++){
                char ch = x.charAt(i);

                if(!temp.containsKey(ch))
                    temp.put(ch, 0);

                temp.put(ch, temp.get(ch)+1);
            }

            for(Map.Entry<Character, Integer> entry : temp.entrySet()){
                char ch = entry.getKey();

                if(!map.containsKey(ch))
                    map.put(ch, 0);

                if(map.get(ch) < entry.getValue())
                    map.put(ch, entry.getValue());
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int count = entry.getValue();

            for(int i = 0; i < count; i++){
                list.add(ch);
            }
        }

        char[] arr = new char[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}
