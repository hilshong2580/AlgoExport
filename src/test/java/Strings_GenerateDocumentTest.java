import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Strings_GenerateDocumentTest {

    @Test
    void generateDocument() {
        String characters = "Bste!hetsi ogEAxpelrt x ";
        String document = "AlgoExpert is the Best!";
        boolean expected = true;
        boolean actual = new Strings_GenerateDocument().generateDocument(characters, document);
        assertTrue(expected == actual);
    }
}