import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Stacks_SunsetViewsTest {

    @Test
    void sunsetViews() {
        int[] buildings = new int[] {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "EAST";
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(7);
        ArrayList<Integer> actual = new Stacks_SunsetViews().sunsetViews(buildings, direction);
        assertTrue(expected.equals(actual));
    }
}