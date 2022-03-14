import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Graphs_CycleInGraphTest {

    @Test
    void cycleInGraph() {
        //Graphs_CycleInGraph
        int[][] input =
                new int[][] {
                        {1, 3},
                        {2, 3, 4},
                        {0},
                        {},
                        {2, 5},
                        {}
                };
        boolean expected = true;
        boolean actual = new Graphs_CycleInGraph().cycleInGraph(input);
        assertTrue(expected == actual);
    }
}