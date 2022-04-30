import java.util.*;


/*
Write a function that takes in a non-empty string and returns its run-length encoding.
From Wikipedia, "run-length encoding is a form of lossless data compression in which rund of data are
stored as a single data value and count, rather than as the original run." For this problem, a run
of data is any sequence of consecutive, identical characters. So the run "AAA" would be
run-length-encoded as "3A".

To make things more complicated, however the input string can contain all sorts of special characters,
including numbers. And since encoded data must be decodable, this means that we can't naively
run-length-encode long runs. For example, the run "AAAAAAAAAAAA" (12 A s), can't naively be
encoded as "12A", since this string can be decoded as either "AAAAAAAAAAAA" or "1AA".
Thus, long runs (runs of 10 or more characters) should be encoded in a split fashion; the
aforementioned run should be encoded as "9A3A".

Sample: String = "AAAAAAAAAAAAABBCCCCDD";  expected = "9A4A2B4C2D";

Idea:
Using the StringBuilder to store the number of char and char as a String.
Using a for loop to check the entire string.
Getting the beginning char into ch, and count the char number by count.
Once the current char different with the previous char, or the count equal to 9, save
it to string builder, and reset the ch and count.
After for loop end, do the last expand to builder.

*/


public class Strings_RunLengthEncoding {
    public String runLengthEncoding(String string) {

        StringBuilder encoded = new StringBuilder();
        char ch = string.charAt(0);
        int count = 0;

        for(int i = 0; i < string.length(); i++){

            if(string.charAt(i) != ch || count == 9)
            {
                encoded.append(String.valueOf(count));
                encoded.append(ch);
                count = 0;
                ch = string.charAt(i);
            }
            count++;
        }


        encoded.append(String.valueOf(count));
        encoded.append(ch);
        return encoded.toString();
    }
}
