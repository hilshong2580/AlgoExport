import java.util.*;

/*
You're given an array of integers and another array of three distinct integers. The first array
us guaranteed to only contain integers that are in the second array represents a desired order
for the integers in the first array. For example, a second array of [x, y, z] represents a desired
order of [x, x, ..., x, y, y, ..., y, z, z, ..., z] in the first array.

Write a function that sorts the first array according to the desired order in the second array.

The function should perform this in place(i.e., it should mutate the input array), and it shouldn't
use any auxiliary space(i,e., it should run with constant space: O(1) space).

Note that the desired order won't necessarily be ascending or descending and theat the first array
won't necessarily contain all three integers found in the second array--it might only contain
one or two.


Sample input:
array = [1, 0, 0, -1, -1, 0, 1, 1]
order = [0, 1, -1]

Sample Output
[0, 0, 0, 1, 1, 1, -1, -1]

Time Complexity: O(n) and Space O(1)

Idea:

The first array is unsort and the second array is the sorting order for first array.
As I know the 2nd array only contains 3 element, I can count the numbers of 1st array
in those 3 number. Then use a for loop to replace the element in correct number and order.

*/

public class Sorting_ThreeNumberSort {


    public int[] threeNumberSort(int[] array, int[] order) {

        int[] count = new int[]{0, 0, 0};

        for(int i = 0; i < array.length; i++){
            int arr = array[i];
            if(arr == order[0])
                count[0]++;
            else if(arr == order[1])
                count[1]++;
            else if(arr == order[2])
                count[2]++;
        }

        int index = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                array[index] = order[i];
                index++;
            }
        }


        return array;
    }

}
