import java.util.*;

public class TwoNumberSum {
    private int[] array;
    private int targetSum;

    public TwoNumberSum(int[] array, int targetSum){
        this.array = array;
        this.targetSum = targetSum;
    }

    public int[] solutionOne(){
        Set<Integer> set = new HashSet<>();
        for (int num : array)
            if(set.contains(targetSum - num))
                return new int[]{num, targetSum - num};
            else
                set.add(num);

        return new int[0];
    }

}
