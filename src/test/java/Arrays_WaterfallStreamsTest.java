import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_WaterfallStreamsTest {

    @Test
    void waterfallStreams() {
        double[][] array =
                new double[][] {
                        {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0},
                        {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                        {1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0},
                        {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0},
                        {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0},
                };
        int source = 3;
        double[] expected = {0.0, 0.0, 0.0, 25.0, 25.0, 0.0, 0.0};
        double[] actual = new Arrays_WaterfallStreams().waterfallStreams(array, source);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < expected.length; i++) assertTrue(expected[i] == actual[i]);
    }
}