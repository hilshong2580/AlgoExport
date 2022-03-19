import java.util.*;

public class Recursion_Permutations {
    /*
    The time complexity upper bound: O(n^2*n!) time and O(n*n!) space
    Roughly: O(n*n!) time | O(n*n!)
    */
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutations(array, new ArrayList<Integer>(), result);
        return result;
    }

    /*
    Write a function that recursively find all permutations. In the function,
    1. Use a if-else statement to check the state when array size == 0 and current size larger than 0;
    2. in else side, remove a element to a list and then push to the function again until reach if state.
    */
    public static void findPermutations(
            List<Integer> array, List<Integer> current, List<List<Integer>> result){
        if(array.size() == 0 && current.size() > 0){
            result.add(current);
        } else {
            for(int i = 0; i < array.size(); i++){
                List<Integer> temp = new ArrayList<Integer>(array);
                temp.remove(i);
                List<Integer> temp2 = new ArrayList<Integer>(current);
                temp2.add(array.get(i));
                findPermutations(temp, temp2, result);
            }
        }
    }
}
