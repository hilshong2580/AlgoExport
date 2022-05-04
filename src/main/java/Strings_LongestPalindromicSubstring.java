import java.util.*;

/*
Write a function that, given a string, returns its longest palindromic substring.
A palindrome is defined as a string that's written the same forward and backward.
Note that single-character strings are palindromes.

You can assume there will only be one longest palindromic substring.

Sample input:
string = "abaxyzzyxf"
output = "xyzzyx"

idea:
Use a for loop to check all char in str.
write a method to find the palindromic string base on current index
  find by odd: compare current left and right
  find by even: compare current and left
return the to save the longest one.

time: O(n^2), space: O(1)

*/

public class Strings_LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String str) {

        if(str.length() == 1)
            return str;
        else if(str.length() == 0)
            return "";

        String longest = "";
        String temp = "";

        for(int i = 1; i < str.length(); i++){

            if(i < str.length()-1)
                longest = checkOddEven(str, i-1, i+1, temp, longest);

            longest = checkOddEven(str, i-1, i, temp, longest);

        }

        return longest;
    }
    public static String checkOddEven(String str, int left, int right, String temp, String longest){

        if(str.charAt(left) == str.charAt(right)){
            boolean check = true;

            while(left > 0 && right < str.length()-1 && check == true){
                check = false;

                if(str.charAt(left-1) == str.charAt(right+1)){
                    check = true;
                    left--;
                    right++;
                }
            }
            temp = str.substring(left, right+1);
            if(temp.length() > longest.length())
                longest = temp;
        }
        return longest;
    }

}
