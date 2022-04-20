import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_MinimumAreaRectangleTest {

    @Test
    void minimumAreaRectangle() {
        int[][] input =
                new int[][] {
                        {1, 5},
                        {5, 1},
                        {4, 2},
                        {2, 4},
                        {2, 2},
                        {1, 2},
                        {4, 5},
                        {2, 5},
                        {-1, -2}
                };
        int expected = 3;
        int actual = new Arrays_MinimumAreaRectangle().minimumAreaRectangle(input);
        assertTrue(expected == actual);

    }
}