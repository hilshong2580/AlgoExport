import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Arrays_ValidateSubsequenceTest {
    private Arrays_ValidateSubsequence validateSubsequence;
    @BeforeEach
    void setUp() {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<Integer>(Arrays.asList(1, 6, -1, 10));
        validateSubsequence = new Arrays_ValidateSubsequence(array, sequence);
    }

    @AfterEach
    void tearDown() {
        validateSubsequence = null;
    }

    @Test
    void isValidSubsequence() {
        assertEquals(true, validateSubsequence.isValidSubsequence());
    }
}