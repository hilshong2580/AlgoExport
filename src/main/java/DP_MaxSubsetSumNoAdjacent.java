import java.util.*;

public class DP_MaxSubsetSumNoAdjacent {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0)
            return 0;
        else if(array.length == 1)
            return array[0];

        int two = array[0];
        int one = Math.max(array[0], array[1]);
        for(int i = 2; i < array.length; i++){
            int current = Math.max(one, two + array[i]);
            two = one;
            one = current;
        }

        return one;
    }
}
