import java.util.*;

/*
Write a function that takes in an n x m two-dimensional array (that can be square-shaped when n == m)
and returns a one-dimensional array of all the array's elements in zigzag order.

Zigzag order starts at the top left corner of the two-dimensional array, goes down by one element,
and proceeds in a zigzag pattern all the way to the bottom right corner.

*/

public class Arrays_ZigzagTraverse {
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        int total = array.size() * array.get(0).size() -1;
        int count = 0, height=array.size()-1, width = array.get(0).size()-1;
        int col = 0, row = 0;
        List<Integer> zRead = new ArrayList<Integer>();
        System.out.println("  ");

        Boolean checkRow = true;
        while(count <= total)
        {
            zRead.add(array.get(row).get(col));

            if(checkRow == true)
            {
                if(col == 0 && row != height)
                {
                    row++;
                    checkRow = false;
                }else if(col != 0 && row != height)
                {
                    col--;
                    row++;
                }else if(row == height)
                {
                    col++;
                    checkRow = false;
                }

            }
            else if(checkRow == false)
            {
                if(row != 0 && col != width)
                {
                    row--;
                    col++;
                }else if(row == 0 && col != width){
                    col++;
                    checkRow = true;
                }else if(col == width){
                    row++;
                    checkRow = true;
                }

            }
            count++;
        }
        return zRead;
    }
}
