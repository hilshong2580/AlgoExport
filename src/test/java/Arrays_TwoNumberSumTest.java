import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_TwoNumberSumTest {
    private Arrays_TwoNumberSum twoNumberSum;
    @BeforeEach
    void setUp() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        twoNumberSum = new Arrays_TwoNumberSum(array, targetSum);
    }

    @AfterEach
    void tearDown() {
        twoNumberSum = null;
    }

    @Test
    void solutionOne() {
        int[] output = this.twoNumberSum.solutionOne();
        assertTrue(output.length == 2);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }
}