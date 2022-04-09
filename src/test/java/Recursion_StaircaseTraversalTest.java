import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recursion_StaircaseTraversalTest {

    @Test
    void staircaseTraversal() {
        int stairs = 4;
        int maxSteps = 2;
        int expected = 5;
        int actual = new Recursion_StaircaseTraversal().staircaseTraversal(stairs, maxSteps);
        assertTrue(expected == actual);

    }
}