import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorting_BubbleSortTest {

    @Test
    void bubbleSort() {
        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};
        assertTrue(compare(Sorting_BubbleSort.bubbleSort(input), expected));
    }
    public boolean compare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}