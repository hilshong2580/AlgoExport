import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class Recursion_ProductSumTest {

    @Test
    void productSum() {
        List<Object> test = new ArrayList<Object>(
                Arrays.asList( 5,2, new ArrayList<Object>(Arrays.asList(7, -1)),
                                3, new ArrayList<Object>( Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        assertTrue(Recursion_ProductSum.productSum(test) == 12);
    }
}