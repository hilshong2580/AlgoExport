
import java.util.*;

/*
You're given a non-empty array of positive integers where each integer represents the
maximum number of steps you can take forward in the array. For example, if the element
at index 1 is 3. you can from index 1 to index 2, 3, or 4.

Write a function that returns the minimum number of jumps needed to reach the final index.

Note that jumping from index i to index i+x always constitutes one jump, no matter how
large x is.

idea:
Check the array's length and return 0 if the length is 1;
Use the for loop to go through 1 to array's length -1,
(The last element no need to check because it ends, return count +1)
The for loop go through the begin element number, then records the second largest one
for the second count.



*/

public class DP_MinNumberOfJumps {
    public static int minNumberOfJumps(int[] array) {
        // Write your code here.

        if(array.length == 1)
            return 0;

        int count = 0, max = array[0], step = array[0];

        for(int i = 1; i < array.length-1; i++){
            max = Math.max(max, i + array[i]);
            step--;
            if(step == 0){
                count++;
                step = max - i;
            }
        }

        return count+1;
    }
}
