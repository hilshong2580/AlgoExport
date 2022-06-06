import java.util.*;

/*

Write a function that takes in a non-empty array of integers and returns the greatest sum
that can be generated from a strictly-increasing subsequence in the array as well as array
of the numbers in that subsequence.

A subsequence of an array is a set of numbers that aren't necessarily adjacent in the
array but that are in the same order as they appear in the array. For instance, the numbers
[1, 3, 4] form a subsequence of the array [1, 2, 3, 4], and so do the numbers [2, 4]. Note
that a single number in an array and the array itself are both valid subsequences of the
array.

You can assume that there will only be one increasing subsequence with the greatest sum.

Idea:

Use a integer array and List<List<Integer>> to save the sum and sequences.
Use two for loop, the outer for loop will use for current index.
The second for loop will go through from 0 to current index.
if the element is lower the current element, use the largest one with current.

*/

public class DP_MaxSumIncreasingSubsequence {

    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {
        // Write your code here.
        int[] sum = new int[array.length];
        List<List<Integer>> element = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            int end = array[i], largest = Integer.MIN_VALUE, index = -1;
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < i; j++){
                if(array[j] < end && largest < sum[j] && sum[j]+end > end){
                    largest = sum[j];
                    index = j;
                    temp = new ArrayList<>();
                    temp.addAll(element.get(j));
                }
            }

            temp.add(end);
            element.add(temp);
            sum[i] = end;
            if(index != -1)
                sum[i] +=sum[index];

        }

        List<Integer> sequence = new ArrayList<>();
        List<Integer> total = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < sum.length; i++){
            if(sum[i] > max){
                max = sum[i];
                sequence = element.get(i);
            }
        }
        element = new ArrayList<>();
        total.add(max);
        element.add(total);
        element.add(sequence);
        return element;
    }
}
