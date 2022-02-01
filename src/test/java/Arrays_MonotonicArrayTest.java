import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_MonotonicArrayTest {

    @Test
    void isMonotonic() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean expected = true;
        boolean actual = Arrays_MonotonicArray.isMonotonic(array);
        assertEquals(expected, actual);
    }
}