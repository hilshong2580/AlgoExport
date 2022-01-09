import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_MergeOverlappingIntervalsTest {

    @Test
    public void TestCase1() {
        int[][] intervals =
                new int[][] {
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };
        int[][] expected =
                new int[][] {
                        {1, 2},
                        {3, 8},
                        {9, 10}
                };
        int[][] actual = new Arrays_MergeOverlappingIntervals().mergeOverlappingIntervals(intervals);
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < actual[i].length; j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}