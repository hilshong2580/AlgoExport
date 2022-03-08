import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Graphs_SingleCycleCheckTest {

    @Test
    void hasSingleCycle() {
        assertTrue(Graphs_SingleCycleCheck.hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
    }
}