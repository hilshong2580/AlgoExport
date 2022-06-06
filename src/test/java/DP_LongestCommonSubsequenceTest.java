import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
class DP_LongestCommonSubsequenceTest {

    @Test
    void longestCommonSubsequence() {
        char[] expected = {'X', 'Y', 'Z', 'W'};
        assertTrue(compare(DP_LongestCommonSubsequence.longestCommonSubsequence("ZXVVYZW", "XKYKZPW"), expected));

    }
    private static boolean compare(List<Character> arr1, char[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}