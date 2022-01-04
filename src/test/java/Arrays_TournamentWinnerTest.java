import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Arrays_TournamentWinnerTest {
    private Arrays_TournamentWinner tournamentWinner;

    @BeforeEach
    void setUp() {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
        tournamentWinner = new Arrays_TournamentWinner(competitions, results);
    }

    @AfterEach
    void tearDown() {
        tournamentWinner = null;
    }

    @Test
    void tournamentWinner() {
        String expected = "Python";
        String result = tournamentWinner.tournamentWinner();
        assertEquals(expected, result);
    }
}