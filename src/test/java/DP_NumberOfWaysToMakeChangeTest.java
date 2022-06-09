import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DP_NumberOfWaysToMakeChangeTest {

    @Test
    void numberOfWaysToMakeChange() {
        int[] input = {1, 5};
        assertTrue(DP_NumberOfWaysToMakeChange.numberOfWaysToMakeChange(6, input) == 2);

    }
}