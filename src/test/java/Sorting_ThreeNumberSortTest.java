import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorting_ThreeNumberSortTest {

    @Test
    void threeNumberSort() {
        int[] array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = new int[] {0, 1, -1};
        int[] expected = new int[] {0, 0, 0, 1, 1, 1, -1, -1};
        int[] actual = new Sorting_ThreeNumberSort().threeNumberSort(array, order);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertTrue(expected[i] == actual[i]);
        }
    }
}