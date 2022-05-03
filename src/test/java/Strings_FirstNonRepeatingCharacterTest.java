import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_FirstNonRepeatingCharacterTest {

    @Test
    void firstNonRepeatingCharacter() {
        String input = "abcdcaf";
        int expected = 1;
        int actual = new Strings_FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }
}