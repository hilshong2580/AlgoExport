import java.util.*;


/*
Write a function that takes in an array of integers and returns a sorted version of that array.
Use the Selection sort algorithm to sort the array.

Hint:
Divide the input array into two subarrays in place. The first subarray should be sorted at all times
and should start with a length of 0, while second subarray should be unsorted. Find the smallest
(or largest) element in the unsorted subarray and insert it into the sorted subarray with a swap.
Repeat this process of finding the smallest (or largest) element in the unsorted subarray and inserting
it in its correct position in the sorted subarray with a swap until the entire array is sorted.

Ideas:
1. Write the methods to keep the empty array and 1 element array.
2. Use two for loop to do the sort.
- First for loop as the sorted array.
- Second for loop as the unsorted array to find the smallest/largest one.
3. The second for-loop should start from the end elemnts of the sorted array.
4. Find the smallest/largest element, then swap it into the last element in sorted array.

Time complexity:
Best O(n^2) time and space O(1) space
Average: O(n^2) time and space O(1) space
Worest: O(n^2) time and space O(1) space

*/

public class Sorting_SelectionSort {
    public static int[] selectionSort(int[] array) {
        // write a condition check to make sure the array is not empty.
        if(array.length <= 1)
            return array;

        int sortedIndex = 0;

        for(int i = 0; i < array.length; i++){
            int key = array[i];
            int index = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < key){
                    key = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = key;
            array[index] = temp;

        }


        return array;
    }
}
