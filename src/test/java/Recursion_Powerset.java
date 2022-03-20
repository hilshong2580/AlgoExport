import java.util.*;

public class Recursion_Powerset {
    public static List<List<Integer>> powerset(List<Integer> array) {
        return powerset(array, array.size()-1);
    }

    public static List<List<Integer>> powerset(List<Integer> array, int idx){
        if(idx < 0){
            List<List<Integer>> emptySet = new ArrayList<>();
            emptySet.add(new ArrayList<Integer>());
            return emptySet;
        }

        int element = array.get(idx);
        List<List<Integer>> subsets = powerset(array, idx - 1);
        int length = subsets.size();
        for( int i = 0; i <length; i++){
            List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
            currentSubset.add(element);
            subsets.add(currentSubset);
        }
        return subsets;
    }
}
