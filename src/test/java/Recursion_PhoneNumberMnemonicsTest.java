import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class Recursion_PhoneNumberMnemonicsTest {

    @Test
    void phoneNumberMnemonics() {
        String phoneNumber = "1905";
        String[] expectedValues =
                new String[] {
                        "1w0j", "1w0k", "1w0l", "1x0j", "1x0k", "1x0l", "1y0j", "1y0k", "1y0l", "1z0j", "1z0k",
                        "1z0l"
                };
        ArrayList<String> expected = new ArrayList<String>();
        for (int i = 0; i < expectedValues.length; i++) {
            expected.add(expectedValues[i]);
        }
        ArrayList<String> actual = new Recursion_PhoneNumberMnemonics().phoneNumberMnemonics(phoneNumber);
        assertTrue(expected.equals(actual));
    }
}