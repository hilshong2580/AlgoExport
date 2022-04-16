import java.util.*;

/*
Write a function that takes in an array of integers and returns a sorted version of thean array.
Use the Insertion Sort algorithm to fort the array.

ideas:
 The main ideas is iterate from arr[1] to arr[n] over the array.
 Compare the current element (key) to its predecessor.
 If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

*/
public class Sorting_InsertionSort {
    public static int[] insertionSort(int[] array) {

        //check the empty array before do the insertion sort;
        if(array.length <= 1)
            return array;


        //loop the array from index 1 to end, compare the previous element, shift to correct index.
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i-1;

            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = current;
        }

        return array;
    }
}
