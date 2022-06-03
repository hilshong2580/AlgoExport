import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_MinRewardsTest {

    @Test
    void minRewards() {
        assertTrue(Arrays_MinRewards.minRewards(new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5}) == 25);
    }
}