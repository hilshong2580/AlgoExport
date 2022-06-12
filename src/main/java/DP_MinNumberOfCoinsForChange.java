import java.util.*;

/*
Given an array of positive integers representing coin denomination and a single non-negative
integer n representing a target amount of money, write a function that returns the smallest
number of coins needed to make change for (to sum up to) that target amount using the given
coin denominations.

Note that you have access to an unlimited amount of coins. In other words, if the
denominations are [1, 5, 10], and you have access to an unlimited amount of 1s, 5s, and 10s.

If it's impossible to make a change for the target amount, return -1;


*/

public class DP_MinNumberOfCoinsForChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int compare = 0;
        int[] count = new int[n+1];
        for(int x = 1; x< count.length; x++)
            count[x] = Integer.MAX_VALUE;
        count[0] = 0;

        for(int coin: denoms)
            for(int i = 0; i < n+1; i++)
                if(coin <= i){
                    if(count[i-coin] == Integer.MAX_VALUE)
                        compare = count[i-coin];
                    else
                        compare = count[i-coin]+1;
                    count[i] = Math.min(count[i], compare);

                }

        return count[n] != Integer.MAX_VALUE ? count[n] : -1;
    }


}
