import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greedy_MinimumWaitingTimeTest {

    @Test
    void minimumWaitingTime() {
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        int actual = new Greedy_MinimumWaitingTime().minimumWaitingTime(queries);
        assertTrue(actual == expected);
    }
}