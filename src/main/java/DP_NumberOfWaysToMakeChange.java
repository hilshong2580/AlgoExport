import java.util.*;

/*
Given an array of distinct positive integers representing coin denominations and a single
non-negative integer n representing a target amount of money, write a function that returns
the number of ways to make change for that target amount using the given coin denomination.



*/

public class DP_NumberOfWaysToMakeChange {
    public static int numberOfWaysToMakeChange(int n, int[] denoms) {
        int[] count = new int[n+1];

        count[0] = 1;
        for(int coin: denoms)
            for(int i = 1; i < n+1; i++){
                if(coin <= i){
                    count[i] += count[i-coin];
                    System.out.println(count[i]+" "+i);
                }
            }

        return count[n];
    }
}
