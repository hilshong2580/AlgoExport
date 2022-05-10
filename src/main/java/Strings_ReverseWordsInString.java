import java.util.*;

/*
Write a function that takes in a string of words separated by one or more whitespaces and returns
a string that has these words in reverse order. For example, given the string "tim is great".

For this problem, a word can contain special special characters, punctuation, and numbers.
The words in the string will be sparated by one or more whitespaces, and the reversed string
must contain the same whitespaces as the original string. For example, given the string
"whitespaces    4" you world be expected to return "4    whitespaces".

Note that you're not allowed to to use any built-in split or reverse metods/functions.
However, you are allowed to use a built-in join method/function.

Also note that the input string isn't guranteed to always contain words.

sample Input
string = "AlgoExpert is the best!"

"best! the is AlgoExpert"


Idea:
For this Question, I have to write a function to reverse a char array base on
start index to end index.

First, convert the string to char array, then use the method to reverse the char array.
Next use a for loop to check the char array. while current char is space use the
reverse method to reverse the specific range of index.
Final, covert the char array to string.




*/


public class Strings_ReverseWordsInString {
    public String reverseWordsInString(String string) {
        char[] ch = string.toCharArray();
        reverseCharArray(ch, 0, string.length()-1);
        int count = 0, end = 0;

        for(int i = 0; i < string.length(); i++){

            if(ch[i] != ' '){
                end = i;
                count++;
                if(i == string.length()-1)
                    reverseCharArray(ch, end - count+1, end);
            }
            else{
                reverseCharArray(ch, end - count+1, end);
                count = 0;
            }
        }
        return String.copyValueOf(ch);
    }

    public void reverseCharArray(char[] ch, int start, int end){

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
}
