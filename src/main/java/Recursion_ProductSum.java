import java.util.*;

public class Recursion_ProductSum {

    public static int productSum(List<Object> array) {

        //System.out.print(array);

        return calculateSum(array, 1);
    }

    public static int calculateSum(List<Object> array, int multiple){
        int sum = 0;

        for(Object obj : array){
            if( obj instanceof ArrayList){
                @SuppressWarnings("unchecked")
                ArrayList<Object> ob = (ArrayList<Object>) obj;
                sum += calculateSum(ob, multiple+1);
            }
            else{
                sum += (int) obj;
            }
        }
        return sum * multiple;
    }
}
