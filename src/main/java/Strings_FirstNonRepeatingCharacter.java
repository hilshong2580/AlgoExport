import java.util.*;

/*

Write a function that takes in a string of lowercase English-alphabet letters and returns the index
of the string's first non-repeating character.

The first non-repeating character is the first character in a string that occurs only once.
If the input string doesn't have any non-repeating characters, your function should return -1.

Sample
string = "abcdcaf"
1

Ideas:
Use a hashMap to store the string's char and number.
Use a for loop to put all the char to map.
Use the other for loop to find the first value is 1 from map.
Then return the index.

*/


public class Strings_FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch, 0);
            int count = map.get(ch);
            map.put(ch, count+1);
        }

        for(int i = 0; i < string.length(); i++){
            if(map.get(string.charAt(i)) == 1)
                return i;

        }
        return -1;
    }

}
