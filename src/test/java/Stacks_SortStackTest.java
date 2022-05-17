import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class Stacks_SortStackTest {

    @Test
    void sortStack() {
        ArrayList<Integer> stack = new ArrayList<Integer>(Arrays.asList(-5, 2, -2, 4, 3, 1));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(-5, -2, 1, 2, 3, 4));
        ArrayList<Integer> actual = new Stacks_SortStack().sortStack(stack);
        assertTrue(expected.equals(actual));
    }
}