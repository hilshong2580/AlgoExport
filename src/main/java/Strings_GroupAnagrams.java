import java.util.*;

/*
*
* Write a function that takes in an array of strings and groups anagrams together.
* Anagrams are strings made up of exactly the same letter, there order doesn't matter.
* For example, "cinema" and "iceman" are anagrams; similarly, "foo" and "ofo" are anagrams.
*
* Your function should return a list of anagram groups in no particular order.
*
*
*

* Ideas:
For this Strings Question, I have to find the group of words those assemble by same letters.
The given List<String> contains all the target words.
So, I can covert the str to char array, then sort it to identify which is the same group.
Using the Map<String, List<String>> to store the sorted words as key and the origin words to
list as value.
Then Store all the list value to a List<List<String>> and return it.

*
* */


public class Strings_GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {

        List<List<String>> group = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < words.size(); i++){
            char[] ch = words.get(i).toCharArray();
            Arrays.sort(ch);
            String str = String.valueOf(ch);
            List<String> temp = new ArrayList<>();

            if(!map.containsKey(str))
                map.put(str, temp);

            List<String> list = map.get(str);
            list.add(words.get(i));
            map.put(str, list);

        }

        for (Map.Entry<String, List<String>> set :
                map.entrySet()) {
            group.add(set.getValue());
        }

        return group;
    }
}
