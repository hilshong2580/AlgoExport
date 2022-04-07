import java.util.*;
public class Searching_BinarySearch {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.

        return binarySearchLR(array, target, 0, array.length-1);
    }

    public static int binarySearchLR(int[] array, int target, int left, int right){
        while(left <= right){
            int center = (left+right)/2;
            if(target == array[center]){
                return center;
            }
            else if(target > array[center]){
                left = center +1;
            }
            else
                right = center -1;
        }
        return -1;
    }
}
