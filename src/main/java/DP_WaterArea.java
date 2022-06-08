import java.util.*;

/*
You're given an array of non-negative integers where each non-zero integer represents
the height of a pillar of width 1. Imagine water being poured over all of the pillars;
write a function that returns the surface area of the water trapped between the pillars
viewed from the front. Note that spilled water should be ignored.

sample: [0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3]
output = 48

idea:
Using three separate for-loop.
First, Find the max water in each index from left to right.
Second, Find the max water in each index from right to left.
Third, Find the min water height from two arrays. Minus the height of bars.
Calculate it as zero if lower than 0; Return the sum.
*/

public class DP_WaterArea {
    public static int waterArea(int[] heights) {
        int max = 0, total = 0;
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        for(int i = 0; i < heights.length; i++){
            leftMax[i] = max;
            max = Math.max(max, heights[i]);
        }

        max = 0;
        for(int i = heights.length-1; i > -1; i--){
            rightMax[i] = max;
            max = Math.max(max, heights[i]);
        }

        for(int i = 0; i < heights.length; i++){
            leftMax[i] = Math.min(leftMax[i], rightMax[i]);
            leftMax[i] = Math.max(leftMax[i] - heights[i], 0);
            total += leftMax[i];
        }
        return total;
    }
}
