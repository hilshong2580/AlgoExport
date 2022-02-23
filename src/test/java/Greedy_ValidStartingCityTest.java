import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greedy_ValidStartingCityTest {

    @Test
    void validStartingCity() {
        int[] distances = new int[] {5, 25, 15, 10, 15};
        int[] fuel = new int[] {1, 2, 1, 0, 3};
        int mpg = 10;
        int expected = 4;
        int actual = new Greedy_ValidStartingCity().validStartingCity(distances, fuel, mpg);
        assertTrue(expected == actual);
    }
}