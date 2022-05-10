import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_ReverseWordsInStringTest {

    @Test
    void reverseWordsInString() {
        String input = "AlgoExpert is the best!";
        String expected = "best! the is AlgoExpert";
        String actual = new Strings_ReverseWordsInString().reverseWordsInString(input);
        assertTrue(expected.equals(actual));
    }
}