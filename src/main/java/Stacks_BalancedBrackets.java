import java.util.*;
import java.util.stream.Collectors;

/*
Write a function that takes in a string made up of brackets " (, [, {, ), ], } "
and other optional characters. The function should return a boolean representing
whether the string is balanced with regards to brackets.

A string is said to be balanced if it has as many opening brackets of a certain type
as it has closing brackets of that type and if no bracket is unmatched. Note that an
opening bracket can't match a corresponding  closing bracket that comes before it, and
similarly, a closing bracket can't match a corresponding opening bracket that comes
after if. Also, brackets can't overlap each other as in [(]).

Hint 1:
If you iterate through the input string one character at a time, there are two scenarios
in which the string will be unbalanced: either you run into a closing bracket with no prior
matching opening bracket or you get to the end of the string with some opening brackets that
haven't been matched. Can you use an anxiliary data structure to keep track of all the brackets
and efficiently check if you run into a unbalanced scenario at every iteration.

Hint 2:
Consider using stack to store opening brackets as you traverse the string. The Last-In-First-Out
property of the stack should allow you to match any closing brackets that you run into against the
most recent opening bracket, if one exists, in which case you can simply pop it out of the stack.
How can you check that there are no unmatched opening bracket once you've finished traversing through
the string?

O(n) time and O(n) space

Idea:
Use the list<Character> to save the ()[]{} and contains() as a filter.
Use the Map<Character, Character> for the match case.
Use the for loop go throw the all brackets.
 - if match remove the top stack
 - else add to stack
Final, if the stack not empty, return false.

*/

public class Stacks_BalancedBrackets {
    public static boolean balancedBrackets(String str) {

        // Create an empty List of character
        List<Character> chars = "(){}[]"
                .chars() 													// Convert to String to IntStream
                .mapToObj(e -> (char)e) 					// Convert IntStream to Stream<Character>
                .collect(Collectors.toList());		// Collect the elements as a List Of Characters

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        boolean check = false;
        List<Character> list = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(chars.contains(ch)){
                if(list.size() > 0){
                    if(brackets.get(ch) == list.get(list.size()-1)){
                        list.remove(list.size()-1);
                    }
                    else
                        list.add(ch);
                } else list.add(ch);
            }
        }

        if(list.size() == 0)
            check = true;

        return check;
    }
}
