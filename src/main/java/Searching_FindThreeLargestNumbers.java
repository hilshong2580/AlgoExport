import java.util.*;


/* Write a function that takes in an array of at least three integers and without sorting the input array,
returns a sorted array  of the three largest integers in the input array.
The function should return duplicate integers if necessary; for example,
it should return [10, 10, 12] for an input array of [10, 5, 9, 10, 12].

For now, input array = [141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]
and the result should be [18, 141, 541]

*/

public class Searching_FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] largestNum = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for(int num : array){
            updateLargest(largestNum, num);
        }
        return largestNum;
    }

    public static void updateLargest(int[] largestNum, int num){
        if(num > largestNum[2]){
            shiftNumber(largestNum, num, 2);
        }
        else if(num > largestNum[1]){
            shiftNumber(largestNum, num, 1);
        }
        else if(num > largestNum[0]){
            shiftNumber(largestNum, num, 0);
        }
    }

    public static void shiftNumber(int[] largestNum, int num, int index){
        for(int i = 0; i <= index; i++){
            if(i == index){
                largestNum[i] = num;
            }
            else {
                largestNum[i] = largestNum[i+1];
            }
        }

    }
}
