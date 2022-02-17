import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greedy_TandemBicycleTest {

    @Test
    void tandemBicycle() {
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;
        int expected = 32;
        int actual = new Greedy_TandemBicycle().tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest);
        assertTrue(expected == actual);
    }
}