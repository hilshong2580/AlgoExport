import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DP_MinNumberOfCoinsForChangeTest {

    @Test
    void minNumberOfCoinsForChange() {
        int[] input = {1, 5, 10};
        assertTrue(DP_MinNumberOfCoinsForChange.minNumberOfCoinsForChange(7, input) == 3);

    }
}