package Arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    private int[] array;
    private int targetSum;
    public TwoNumberSum(int[] array, int targetSum){
        this.array = array;
        this.targetSum = targetSum;
    }

    public int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> set = new HashSet<>();
        for (int num : array)
            if(set.contains(targetSum - num))
                return new int[]{num, targetSum - num};
            else
                set.add(num);

        return new int[0];
    }
}
