import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class Greedy_TaskAssignmentTest {

    @Test
    void taskAssignment() {
        int k = 3;
        ArrayList<Integer> tasks = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 3, 1, 4));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subarr = new ArrayList<Integer>(Arrays.asList(4, 2));
        ArrayList<Integer> subarr2 = new ArrayList<Integer>(Arrays.asList(0, 5));
        ArrayList<Integer> subarr3 = new ArrayList<Integer>(Arrays.asList(3, 1));
        expected.add(subarr);
        expected.add(subarr2);
        expected.add(subarr3);
        System.out.println(expected);
        ArrayList<ArrayList<Integer>> actual = new Greedy_TaskAssignment().taskAssignment(k, tasks);
        System.out.println(actual);
        assertTrue(expected.equals(actual));

    }
}