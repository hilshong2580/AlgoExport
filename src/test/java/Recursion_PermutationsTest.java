import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Recursion_PermutationsTest {

    @Test
    void getPermutations() {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        List<List<Integer>> perms = Recursion_Permutations.getPermutations(input);
        assertTrue(perms.size() == 6);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
    }

    public boolean contains(List<List<Integer>> arr1, List<Integer> arr2) {
        for (List<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}