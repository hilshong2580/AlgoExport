import java.util.*;

public class Arrays_ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList<Integer[]> aList = new ArrayList<Integer[]>();

        for(int i = 0; i < array.length-2; i++)
            for(int j = i+1; j < array.length-1; j++)
                for(int k = j+1; k < array.length; k++)
                    if(array[i] + array[j] + array[k] == targetSum)
                    {
                        Integer[] arr = new Integer[3];
                        arr[0] = array[i];
                        arr[1] = array[j];
                        arr[2] = array[k];
                        aList.add(arr);
                    }

        return aList;
    }
}
