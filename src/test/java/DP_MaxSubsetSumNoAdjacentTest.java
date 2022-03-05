import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class DP_MaxSubsetSumNoAdjacentTest {

    @Test
    void maxSubsetSumNoAdjacent() {
        int[] input = {75, 105, 120, 75, 90, 135};
        assertTrue(DP_MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 330);
    }
}