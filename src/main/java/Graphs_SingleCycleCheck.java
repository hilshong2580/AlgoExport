import java.util.*;

public class Graphs_SingleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {
        int visited = 0;
        int current = 0;

		/*in this while loop, we have to visited element from 0 to n,
		There also need one more move from last element back to beginning element.
		As a result, the total move should be 0 to n + 1 which equal to the array size.
		So, Once the num of visited equal to the array length, the current position should
		be beginning index if true, else false.
		*/
        while(visited < array.length){
			/*In this if statement, it is use to prevent a part of array loop
			which match the true case, such as {1, -1, 2, 2} and start at index 0.
			The element jump only happen on the first and second element. It could be
			the visited equal to array's length and current index equal to beginning index
			but program doesn't visited all element.

			Therefore, when the case happen inside the while loop the current index back to
			the beginning index and the visited larger than 0. It should have self loop and
			return false.

			*/
            if(visited > 0 && current == 0)
                return false;
            visited++;
            current = nextElement(array, current);
        }
        return current == 0;
    }

    /*For this function, it used to find the jump index.
    We have to use the current index to get the index's element value.
  Sum of the current with element value. if sum larger than the array length.
    Use the % symbol to get the remainder num as the current index.
    if the current index is negative, add with the array length to covert it positive.
    */
    public static int nextElement(int[] array, int index){
        int size = array.length, element = array[index];
        int next = (index + element) % size;

        if(next >= 0)
            return next;
        else
            return next + size;
    }
}
