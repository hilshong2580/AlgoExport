import java.util.*;
import java.lang.Math;

public class Arrays_SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int first = 0;
        int second = 0;
        int smallest = 2147483647;
        int current = 2147483647;
        int[] pair = new int[2];

        while(first < arrayOne.length && second < arrayTwo.length)
        {
            int arrOne = arrayOne[first];
            int arrTwo = arrayTwo[second];

            if(arrOne < arrTwo)
            {
                current = arrTwo - arrOne;
                first++;
            } else if(arrTwo < arrOne)
            {
                current = arrOne - arrTwo;
                second++;
            } else
                return new int[] {arrOne, arrTwo};


            if(smallest > current)
            {
                smallest = current;
                pair[0] = arrOne;
                pair[1] = arrTwo;
            }
        }
        return pair;
    }
}
