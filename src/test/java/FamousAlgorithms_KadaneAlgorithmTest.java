import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamousAlgorithms_KadaneAlgorithmTest {

    @Test
    void kadanesAlgorithm() {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
        assertTrue(FamousAlgorithms_KadaneAlgorithm.kadanesAlgorithm(input) == 19);
    }
}