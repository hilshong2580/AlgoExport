import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_LongestPalindromicSubstringTest {

    @Test
    void longestPalindromicSubstring() {
        assertTrue(Strings_LongestPalindromicSubstring.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
    }
}