import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class BST_RightSmallerThanTest {

    @Test
    void rightSmallerThan() {
        List<Integer> array = Arrays.asList(8, 5, 11, -1, 3, 4, 2);
        List<Integer> expected = Arrays.asList(5, 4, 4, 0, 1, 1, 0);
        List<Integer> actual = BST_RightSmallerThan.rightSmallerThan(array);
        assertEquals(actual, expected);
    }

    @Test
    void rightSmallerThan2() {
        List<Integer> array = Arrays.asList(8, 5, 11, -1, 3, 4, 2);
        List<Integer> expected = Arrays.asList(5, 4, 4, 0, 1, 1, 0);
        List<Integer> actual = BST_RightSmallerThan.rightSmallerThan2(array);
        assertEquals(actual, expected);
    }
}