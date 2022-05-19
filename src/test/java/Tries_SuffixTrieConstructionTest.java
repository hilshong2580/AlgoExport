import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Tries_SuffixTrieConstructionTest {

    @Test
    void TestCase(){
        Tries_SuffixTrieConstruction.SuffixTrie trie = new Tries_SuffixTrieConstruction.SuffixTrie("babc");
        assertTrue(trie.contains("abc"));
    }
}