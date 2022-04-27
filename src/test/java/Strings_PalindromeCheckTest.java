import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_PalindromeCheckTest {

    @Test
    void isPalindrome() {
        assertTrue(Strings_PalindromeCheck.isPalindrome("abcdcba"));
    }
}