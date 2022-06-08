import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DP_WaterAreaTest {

    @Test
    void waterArea() {
        int[] input = {0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3};
        assertTrue(DP_WaterArea.waterArea(input) == 48);
    }
}