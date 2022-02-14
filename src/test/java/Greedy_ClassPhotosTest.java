import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Greedy_ClassPhotosTest {

    @Test
    void classPhotos() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new Greedy_ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }
}