import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class Arrays_LargestRangeTest {

    @Test
    void largestRange() {
        int[] expected = {0, 7};
        assertTrue(
                Arrays.equals(
                        Arrays_LargestRange.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected));
    }
}