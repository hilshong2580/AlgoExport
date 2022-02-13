import java.util.*;

public class Greedy_MinimumWaitingTime {
    // O(n Log n) time because all sort should at least O(n log n)
    public int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int min = 0;
        int duration = 0;

        for(int i = 0; i < queries.length-1; i++){
            duration = duration + queries[i];
            min += duration;
        }


        System.out.print(min);

        return min;
    }
}
