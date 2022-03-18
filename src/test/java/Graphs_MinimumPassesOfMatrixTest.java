import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Graphs_MinimumPassesOfMatrixTest {

    @Test
    void minimumPassesOfMatrix() {
        int[][] matrix = new int[][] {{0, -1, -3, 2, 0}, {1, -2, -5, -1, -3}, {3, 0, 0, -4, -1}};
        int expected = 3;
        int actual = new Graphs_MinimumPassesOfMatrix().minimumPassesOfMatrix(matrix);
        assert (expected == actual);
    }
}