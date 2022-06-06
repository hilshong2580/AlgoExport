import java.util.*;


/*
Write a function that takes in two strings and returns their longest common subsequence.
A subsequence of a string is a set of characters that aren't necessarily adjacent in the
string but that are in the same order as they appear in the string. For instance, the
characters "[a, c, d]" form a subsequence of the string "abcd". and so do the characters
"[b, d]". Note that a single character in a string and the string itself are both valid
subsequences of the string.

You can assume that there will only be one longest common subsequence.

Ideas:
Use 3D-List to store the character.
if the upper level contains the character and the previous list is empty, add the upper list to current
if the upper list and previous are not empty, add the larger one to current
Add the new matching one to current;
return the max size list.

*/


public class DP_LongestCommonSubsequence {
    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        // Write your code here.
        List<List<List<Character>>> list = new ArrayList<>();

        for(int i = 0; i < str1.length()+1; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j < str2.length()+1; j++){
                list.get(i).add(new ArrayList<>());
            }
        }

        int size = 0, h = 0, k = 0;
        for(int i = 1; i < str1.length()+1; i++){
            for(int j = 1; j < str2.length()+1; j++){
                List<Character> temp = new ArrayList<>();
                if(list.get(i).get(j-1).isEmpty() && !list.get(i-1).get(j).isEmpty())
                    temp.addAll(list.get(i-1).get(j));
                else if(!list.get(i).get(j-1).isEmpty() && !list.get(i-1).get(j).isEmpty()
                        && list.get(i-1).get(j).size() >= list.get(i).get(j-1).size()){
                    temp.addAll(list.get(i-1).get(j));
                }else{
                    temp.addAll(list.get(i).get(j-1));
                }
                if(str1.charAt(i-1) == str2.charAt(j-1) && !temp.contains(str1.charAt(i-1))){
                    temp.add(str1.charAt(i-1));
                }

                list.get(i).get(j).addAll(temp);
                if(list.get(i).get(j).size() > size)
                {
                    size = list.get(i).get(j).size();
                    h = i;
                    k = j;
                }
            }
        }
        return list.get(h).get(k);
    }
}
