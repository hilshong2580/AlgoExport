import java.util.*;

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
