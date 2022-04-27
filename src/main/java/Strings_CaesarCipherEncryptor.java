import java.util.*;

/*
* Given a non-empty string of lowercase letters and a non-negative integer representing
* a key, write a function that returns a new string obtained by shifting every letter in the
* input string by k positions in the alphabet, where k is the key.
*
* Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.
* */

public class Strings_CaesarCipherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {

        char[] arr = new char[str.length()];

        int a = 96, z = 122;
        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i);

            num = num+key;
            while(num > z)
                num = ((num) % z)+a;


            System.out.println(num);
            arr[i] = (char)num;


        }

        String str2 = String.valueOf(arr);
        System.out.println(str2);


        return str2;
    }
}