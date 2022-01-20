import java.util.*;

public class Arrays_MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int index = 0;
        int arraySize = array.size();
        ArrayList<Integer> aList = new ArrayList<Integer>();

        System.out.print(arraySize);
        System.out.println(" ");

        for(int i = 0; i < arraySize; i++)
        {
            if(array.get(i) != toMove){
                aList.add(array.get(i));
            }
        }

        for(int i = 0; i < arraySize; i++)
        {
            if(array.get(i) == toMove){
                aList.add(array.get(i));
            }
        }

        return aList;
    }
}
