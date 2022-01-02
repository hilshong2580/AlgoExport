import java.util.List;
import java.util.*;

public class Arrays_SortedSquaredArray {
    private int[] array;

    public Arrays_SortedSquaredArray(int[] array){
        this.array = array;
    }

    public int[] sortedSquaredArray(){
        for(int i = 0; i < array.length; i++){
            int newNum = array[i]*array[i];
            array[i] = newNum;
        }
        Arrays.sort(array);
        return array;
    }
}
