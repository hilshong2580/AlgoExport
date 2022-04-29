import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_CaesarCipherEncryptorTest {

    @Test
    void caesarCypherEncryptor() {
        assertTrue(Strings_CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 2).equals("zab"));
    }
}