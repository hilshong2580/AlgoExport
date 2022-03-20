import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Recursion_PowersetTest {

    @Test
    void powerset() {
        List<List<Integer>> output = Recursion_Powerset.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        assertTrue(output.size() == 8);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    public boolean contains(List<List<Integer>> arr1, int[] arr2) {
        for (List<Integer> subArr : arr1) {
            Collections.sort(subArr);
            if (compare(subArr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}