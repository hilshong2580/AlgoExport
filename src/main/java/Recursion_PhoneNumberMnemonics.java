import java.util.*;

public class Recursion_PhoneNumberMnemonics {

    /*
Almost every digit is associated with some letters in the alphabet;
this allows certain phone numbers to spell out actual words. For example,
the phone number 8454747328 can be written as timisgreat; similarly,
the phone number 2686463 can be written as antoine or as ant6463.

It’s important to note that a phone number doesn’t represent a single sequence of letters,
but rather multiple combinations of letters.
For instance, the digit 2 can represent three different letters(a, b and c).

A mnemonic is defined as a pattern of letters, ideas or associations that assist in remembering something.
Companies oftentimes use a mnemonic for their phone number to make it easier to remember.

Given a stringified phone number of any non-zero length,
write a function that returns all mnemonics for this phone number, in any order.

For this problem, a valid mnemonic may only contain letters and the digits 0 and 1.
In other words, if a digit is able to be represented by a letter, then it must be.
Digits 0 and 1 are the only two digits that don’t have letter representations on the keypad.

Note that you should rely on the keypad illustrated above for digit-letter associations.

sample input
phoneNumber = "1905"

sample output = [
 "1w0j", "1w0k", "1w0l", "1x0j", "1x0k", "1x0l", "1y0j", "1y0k", "1y0l", "1z0j", "1z0k", "1z0l"
]

*/

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
        String[] mnemonicsCurrent = new String[phoneNumber.length()];
        Arrays.fill(mnemonicsCurrent, "0");

        ArrayList<String> result = new ArrayList<>();
        mnemonicsHelper(0, phoneNumber, mnemonicsCurrent, result);
        return result;
    }

    public void mnemonicsHelper(int index, String phoneNumber,
                                String[] mnemonicsCurrent, ArrayList<String> result){

        for(String x:mnemonicsCurrent)
            System.out.print(x);
        System.out.println(" "+index);

        if(index == phoneNumber.length()){
            String mnemonic = String.join("", mnemonicsCurrent);
            result.add(mnemonic);
        } else {
            char dig = phoneNumber.charAt(index);
            String[] letters = digit.get(dig);
            for(String letter : letters){
                mnemonicsCurrent[index] = letter;
                mnemonicsHelper(index+1, phoneNumber, mnemonicsCurrent, result);
            }
        }


    }
}
