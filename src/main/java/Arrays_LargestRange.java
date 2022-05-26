import java.util.*;

/*
Write a function that takes in an array of integers and returns an array of length 2 representing
the largest range of integers contained in that array.

The first number in the output array should be the first number in the range, while the second number should be the
last number in the range.

A range of numbers is defined as a set of numbers that come right after each other in the set of real integers. For
instance, the output array [2, 6] represents the range {2, 3, 4, 5, 6}, which is a range of length 5. Note that numbers
don't need to be sorted or adjacent in the input array in order to form a range.
You can assume that there will only be one largest range.

* */
public class Arrays_LargestRange {
    public static int[] largestRange(int[] array) {
        int[] range = new int[2];
        Map<Integer, Boolean> check = new HashMap<Integer, Boolean>();
        int longest = 0;

        for(int num : array)
            check.put(num, true);

        for(int num : array){
            if(check.get(num) == false)
                System.out.println("checked");
            else {
                check.put(num, false);
                int cur = 1;
                int left = num - 1;
                int right = num + 1;

                while(check.containsKey(left)){
                    check.put(left, false);
                    cur++;
                    left--;
                }

                while(check.containsKey(right)){
                    check.put(right, false);
                    cur++;
                    right++;
                }

                if(longest < cur){
                    longest = cur;
                    range[0] = left+1;
                    range[1] = right-1;
                }
            }
        }

        return range;
    }
}
