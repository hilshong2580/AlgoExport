import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class BST_SameBSTsTest {

    @Test
    void sameBsts() {
        List<Integer> arrayOne = new ArrayList<Integer>(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, 11));
        List<Integer> arrayTwo = new ArrayList<Integer>(Arrays.asList(10, 8, 5, 15, 2, 12, 11, 94, 81));
        assertTrue(BST_SameBSTs.sameBsts(arrayOne, arrayTwo) == true);
    }
}