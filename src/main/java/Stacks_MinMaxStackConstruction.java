import java.util.*;


/*
Write a MinMaxStack class for a Min Max Stack. The class should support:
1. Pushing and popping values on and off the stack.
2. Peeking at the value at the top of the stack.
3. Getting both the minimum and the maximum values in the stack at any given point in time.

All class methods, when considered independently, should run in constant time and with constant space.

Idea: Last in, First out.
This Question use O(1) time and O(1) space

Use List<Integer> stack for pop, peek, push.
Use List<Map<String, Integer>> for push, getMin, getMax (String:min, max)




*/

public class Stacks_MinMaxStackConstruction {

    static class MinMaxStack {
        List<Map<String, Integer>> minMax = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();


        public int peek() {
            return stack.get(stack.size()-1);
        }

        public int pop() {

            int num = stack.get(stack.size()-1);

            for(Map<String, Integer> temp : minMax){
                System.out.println(temp.get("min")+"  "+ temp.get("max"));
            }

            stack.remove(stack.size()-1);
            minMax.remove(minMax.size()-1);
            return num;
        }

        public void push(Integer number) {
            stack.add(number);
            Map<String, Integer> map = new HashMap<>();
            map.put("min", number);
            map.put("max", number);

            if(minMax.size() > 0){
                if(map.get("min") > minMax.get(minMax.size()-1).get("min"))
                    map.put("min", minMax.get(minMax.size()-1).get("min"));
                if(map.get("max") < minMax.get(minMax.size()-1).get("max"))
                    map.put("max", minMax.get(minMax.size()-1).get("max"));
            }
            minMax.add(map);
        }

        public int getMin() {
            return minMax.get(minMax.size()-1).get("min");
        }

        public int getMax() {
            return minMax.get(minMax.size()-1).get("max");
        }
    }

}
