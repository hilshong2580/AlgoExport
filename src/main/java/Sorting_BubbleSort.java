import java.util.*;

public class Sorting_BubbleSort {

    public static int[] bubbleSort(int[] array) {

        // check the array is not empty
        if(array.length == 0){
            return new int[]{};
        }

        // set a boolean for while loop, stop if true;
        boolean isSorted = false;

        // count the sorted number, not necessary to run the for loop to the end
        int counter = 0;

        while(!isSorted){

            //update the boolean is true, if the array is in order, the run time is O(1).
            isSorted = true;
            // the maximum loop is minus the sorted number
            for(int i = 0; i < array.length-1-counter; i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }

            // increase the sorted number
            counter++;
        }
        return array;
    }
}
