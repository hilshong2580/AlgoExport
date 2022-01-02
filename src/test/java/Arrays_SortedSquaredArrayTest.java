import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_SortedSquaredArrayTest {
    private Arrays_SortedSquaredArray sortedSquaredArray;

    @BeforeEach
    void setUp() {
        sortedSquaredArray = new Arrays_SortedSquaredArray(new int[] {1, 2, 3, 5, 6, 8, 9});
    }

    @AfterEach
    void tearDown() {
        sortedSquaredArray = null;
    }

    @Test
    void sortedSquaredArray() {
        int[] expected =  {1, 4, 9, 25, 36, 64, 81};
        int[] actual = sortedSquaredArray.sortedSquaredArray();
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}