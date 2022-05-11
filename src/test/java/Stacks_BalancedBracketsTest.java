import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stacks_BalancedBracketsTest {

    @Test
    void balancedBrackets() {
        String input = "([])(){}(())()()";
        assertTrue(Stacks_BalancedBrackets.balancedBrackets(input));
    }
}