import java.util.*;

/*
Write a function that takes in an array of integers representing a stack, recursively sorts the stack
in place( i.e doesn't create a brand new array), and returns it.

The array must be treated as a stack, with the end of the array as the loop of the stack. Therefore
you're only allowed to
1. Pop elements form the top of the stack by removing elements from the end of the array using
the built-in .pop() method in your programming language of choice.
2. Push elements to the top of the stack by appending elements to the end of the array using
the built-in .append() method in your programming langyage of choice.
3. Peek at the element on top of the stack by accessing the last element in the array.

You're not allowed to perform any other operations on the input array, including accessing elements
(except for the last element), moving elements, etc.. You're also not allowed to use any other data
structures, and you solution must be recursive.

ideas:
The first method will recursively move out all the element from stack.
Pass the empty stack and the last element to second function.
continously insert the previous element as recursive.
If the current element smaller than the stack's top element. The second method will move out the
top element until the correct position.

*/

public class Stacks_SortStack {
    public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {

        if(stack.size() == 0){
            return stack;
        }

        int top = stack.remove(stack.size()-1);

        sortStack(stack);

        insertInSortedOrder(stack, top);


        return stack;
    }

    public void insertInSortedOrder(ArrayList<Integer> stack, int value){
        if( stack.size() == 0 || (stack.get(stack.size() -1 ) <= value)){
            stack.add(value);
            return;
        }
        int top = stack.remove(stack.size()-1);
        insertInSortedOrder(stack, value);
        stack.add(top);

    }
}
