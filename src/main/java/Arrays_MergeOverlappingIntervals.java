import java.util.*;


/*
Write a function that takes in a non-empty array of arbitrary intervals, merges any overlapping
intervals, and returns the new intervals in no particular order.

Each interval is an array of two integers, with interval[0] as the start of the interval and
interval[1] as the end of the interval.

Note that back-to-back intervals aren't considered to be overlapping. For example, [1,5] and [6, 7]
aren't overlapping; however, [1, 6] and [, 7] are indeed overlapping.

Also note that the start of any particular interval will always be less than or equal to the end of
that interval.

input :[
  [1, 2],
  [3, 5],
  [4, 7],
  [6, 8],
  [9, 10]
]


Idea:
Have to sort the intervals by "Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));"
If overlapping, store the min and max value from two set value.


*/
public class Arrays_MergeOverlappingIntervals {
    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        List<Integer[]> aList = new ArrayList<>();
        int index = 0;
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        int overFir = sortedIntervals[0][0], overSec = sortedIntervals[0][1];

        for(int i = 1; i < sortedIntervals.length; i++)
        {

            if( overSec >= sortedIntervals[i][0]){
                overFir = Math.min(overFir, sortedIntervals[i][0]);
                overSec = Math.max(overSec, sortedIntervals[i][1]);
            }
            else {
                aList.add(new Integer[]{overFir, overSec});
                index++;
                overFir = sortedIntervals[i][0];
                overSec = sortedIntervals[i][1];
            }

        }
        aList.add(new Integer[]{overFir, overSec});

        int[][] result = new int[aList.size()][2];
        index = 0;

        for(Integer[] x : aList){
            result[index][0] = x[0];
            result[index][1] = x[1];
            index++;
        }

        return result;
    }
}

