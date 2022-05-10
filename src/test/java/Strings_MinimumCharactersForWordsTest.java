import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_MinimumCharactersForWordsTest {

    @Test
    void minimumCharactersForWords() {
        String[] words = new String[] {"this", "that", "did", "deed", "them!", "a"};
        char[] expected = new char[] {'t', 't', 'h', 'i', 's', 'a', 'd', 'd', 'e', 'e', 'm', '!'};
        char[] actual = new Strings_MinimumCharactersForWords().minimumCharactersForWords(words);
        assert (expected == actual);
    }
}