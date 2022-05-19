import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stacks_NextGreaterElementTest {

    @Test
    void nextGreaterElement() {
        int[] input = new int[] {2, 5, -3, -4, 6, 7, 2};
        int[] expected = new int[] {5, 6, 6, 6, 7, -1, 5};
        int[] actual = new Stacks_NextGreaterElement().nextGreaterElement(input);
        assert (expected.equals(actual));
    }
}