import java.util.*;

public class Arrays_MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean checkInc = true;
        boolean checkDec = true;

        for(int i = 0; i < array.length-1; i++)
        {
            if(array[i+1] < array[i])
                checkInc = false;

            if(array[i] < array[i+1])
                checkDec = false;
        }

        if(checkInc == true || checkDec == true)
            return true;

        return false;
    }
}
