import java.util.*;


/*

Given an array of buildings and a direction that all of the buildings face, return an array
of the indices of the bildings that can see the sunset.

A building can see the sunset if it's strictly taller than all of the buildings that come after
it in the direction that it faces.

The input array named buildings contains positive, non-zero integers representing the heights
of the buildings. A building at index i thus has a height denoted by buildings[i]. All of the
buildings face the same direction, and this direction is either east or west, denoted by the
input string named direction, which will always be equal to either "EAST" ot "WEST". In relation
to the input array, you can interpret these directions as right for east and left for west.

Important note: the indecs in the output array should be sorted in ascending order.

buildings = [3, 5, 4, 4, 3, 1, 3, 2]
direction = "EAST"

output: [1, 3, 6, 7]

idea:
For this question, I will put the array into List. Nothing change is "WEST"
use the Collections.reverse() for "EAST"

Using a for loop to find the matching case index

return list result

*/


public class Stacks_SunsetViews {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        int current = -1, size = buildings.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        boolean check = direction.equals("EAST");

        for(int i : buildings)
            list.add(i);

        if(check)
            Collections.reverse(list);

        for(int i = 0; i < list.size(); i++)
            if(current < list.get(i)){
                current = list.get(i);
                if(check)
                    result.add(size-i);
                else
                    result.add(i);
            }

        if(check)
            Collections.reverse(result);

        return result;
    }
}
