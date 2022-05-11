import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stacks_MinMaxStackConstructionTest {

    public void testMinMaxPeek(int min, int max, int peek, Stacks_MinMaxStackConstruction.MinMaxStack stack) {
        assertTrue(stack.getMin() == min);
        assertTrue(stack.getMax() == max);
        assertTrue(stack.peek() == peek);
    }

    @Test
    void TestCase1(){
        Stacks_MinMaxStackConstruction.MinMaxStack stack = new Stacks_MinMaxStackConstruction.MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(7);
        testMinMaxPeek(5, 7, 7, stack);
        stack.push(2);
        testMinMaxPeek(2, 7, 2, stack);
        assertTrue(stack.pop() == 2);
        assertTrue(stack.pop() == 7);
        testMinMaxPeek(5, 5, 5, stack);
    }
}