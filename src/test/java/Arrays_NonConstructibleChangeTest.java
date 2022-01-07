import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_NonConstructibleChangeTest {
    private Arrays_NonConstructibleChange nonConstructibleChange;
    @BeforeEach
    void setUp() {
        nonConstructibleChange = new Arrays_NonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22});
    }

    @AfterEach
    void tearDown() {
        nonConstructibleChange = null;
    }

    @Test
    void nonConstructibleChange() {
        int expected = 20;
        int actual = nonConstructibleChange.nonConstructibleChange();
        assertEquals(expected, actual);
    }
}