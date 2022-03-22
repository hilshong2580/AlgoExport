import java.util.*;

public class Recursion_PhoneNumberMnemonics {

    public static Map<Character, String[]> digit = new HashMap<Character, String[]>();

    static{
        digit.put('0', new String[]{"0"});
        digit.put('1', new String[]{"1"});
        digit.put('2', new String[]{"a", "b", "c"});
        digit.put('3', new String[]{"d", "e", "f"});
        digit.put('4', new String[]{"g", "h", "i"});
        digit.put('5', new String[]{"j", "k", "l"});
        digit.put('6', new String[]{"m", "n", "o"});
        digit.put('7', new String[]{"p", "q", "r", "s"});
        digit.put('8', new String[]{"t", "u", "v"});
        digit.put('9', new String[]{"w", "x", "y", "z"});
    }

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
        return new ArrayList<String>();
    }
}
