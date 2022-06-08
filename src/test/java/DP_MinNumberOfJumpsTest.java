import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DP_MinNumberOfJumpsTest {

    @Test
    void minNumberOfJumps() {
        int[] input = {3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3};
        assertTrue(DP_MinNumberOfJumps.minNumberOfJumps(input) == 4);
    }
}