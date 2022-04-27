import java.util.*;

/*
* Write a function that takes in an non-empty string and that returns a boolean representing whether
* the string is a palindrome.
*
* A palindrome is defined as a string that's written the same forward and backward. Note that
* single-character strings are palindromes.
*
* Ideas:
* This is a easy strings question. Use the length() function to get the str length.
* Then compare the begin and end char, if match, move begin to left and move end to right.
* */

public class Strings_PalindromeCheck {
    public static boolean isPalindrome(String str) {
        if(str.length() == 1)
            return true;

        int start = 0, end = str.length()-1, mid = str.length() / 2;

        while( start < mid || end > mid ){
            if( str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
