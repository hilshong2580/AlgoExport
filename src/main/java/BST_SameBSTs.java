import java.util.*;

public class BST_SameBSTs {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {

        if (arrayOne.size() == arrayTwo.size() && arrayOne.size() == 0)
            return true;

        if(arrayOne.size() != arrayTwo.size())
            return false;

        if(!arrayOne.get(0).equals(arrayTwo.get(0)))
            return false;

        List<Integer> oneSmaller = getSmaller(arrayOne);
        List<Integer> twoSmaller = getSmaller(arrayTwo);
        List<Integer> oneBigger = getBigger(arrayOne);
        List<Integer> twoBigger = getBigger(arrayTwo);

        return sameBsts(oneSmaller, twoSmaller) && sameBsts(oneBigger, twoBigger);
    }

    public static List<Integer> getSmaller(List<Integer> list){
        List<Integer> array = new ArrayList<>();

        for(int i = 1; i < list.size(); i++)
            if(list.get(i) < list.get(0))
                array.add(list.get(i));
        return array;
    }

    public static List<Integer> getBigger(List<Integer> list){
        List<Integer> array = new ArrayList<>();

        for(int i = 1; i < list.size(); i++)
            if(list.get(i) >= list.get(0))
                array.add(list.get(i));
        return array;
    }

}
