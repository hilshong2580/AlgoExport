import java.util.*;

public class FamousAlgorithms_KadaneAlgorithm {
    public static int kadanesAlgorithm(int[] array) {
        int temp = array[0], max = array[0];

        for(int i = 1; i < array.length; i++){
            int current = array[i];
            temp = Math.max(current, temp+current);
            max = Math.max(temp, max);
        }

        return max;
    }
}
