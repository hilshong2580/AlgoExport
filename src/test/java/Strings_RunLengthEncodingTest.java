import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_RunLengthEncodingTest {

    @Test
    void runLengthEncoding() {
        String input = "AAAAAAAAAAAAABBCCCCDD";
        String expected = "9A4A2B4C2D";
        String actual = new Strings_RunLengthEncoding().runLengthEncoding(input);
        assertTrue(expected.equals(actual));

    }
}