import java.util.*;

/*
You're given a string of available characters and a string representing a document that you
need to generate. Write a function that determines if you can generate the document using
the available characters. If you can generate the document, your function should return true;
otherwise, it should return false.

You're only able to generate the document if the frequency of unique characters in the characters
string is greater than or equal to the frequency of unique characters in the document string.
For example, if you're given characters = 'abcabc' and document = "aabbccc" you cannot
generate the document because you're missing one c.

The document that you need to create may contain any characters, including special characters,
capital letters, numbers and spaces.

Note:you can always generate the empty string("").

Ideas:
Use for-loop to store he characters element and count the number by HashMap<Character, Integer>.
Use the second for-loop to read each char in document.
If HashMap do not contain document's char, return false;
If HashMap key's value is 0 or lower, return false;

finally return true,






*/


public class Strings_GenerateDocument {

    public boolean generateDocument(String characters, String document) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < characters.length(); i++){
            char ch1 = characters.charAt(i);

            if(!map.containsKey(ch1))
                map.put(ch1, 0);

            map.put(ch1, map.get(ch1)+1);
        }

        for(int i = 0; i < document.length(); i++){
            char ch2 = document.charAt(i);

            if(!map.containsKey(ch2) || map.get(ch2) < 1)
                return false;

            map.put(ch2, map.get(ch2)-1);

        }

        return true;
    }
}
