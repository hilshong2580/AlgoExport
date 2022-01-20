import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
class Arrays_SmallestDifferenceTest {

    @Test
    void smallestDifference() {
        int[] expected = {28, 26};
        assertTrue(
                Arrays.equals(
                        Arrays_SmallestDifference.smallestDifference(
                                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
                        expected));
    }
}