import java.util.*;

/*You're given two positive integers representing the height of a staircase
and the maxumum number of steps that you can advance up the staircase at a time.
Write a function that returns the number of ways in which you can climb the staircase.

For example, if you were given a staircase of height = 3 and maxSteps = 2 you could climb the staircase in 3 way.
You could take 1 step, 1 step, then 1 step, you could also take 1 step, then 2 steps, and you could take 2 steps, then 1 step.

Note that maxSteps <= height will always be true.
*/

public class Recursion_StaircaseTraversal {

    public int staircaseTraversal(int height, int maxSteps) {

        // write a function that recursively find the number of staircase
        return findStaircase(height, maxSteps);
    }

    public int findStaircase(int height, int maxSteps){

        // findStaircase function will do the minus "height - step", so the height may low than 1.
        if(height <= 1){
            return 1;
        }
        int count = 0;

        // the first case is all 1 for four num, then recusively last digit is 2;
        // the 2 will move letf until to start, then the second 2 will appear.
        for(int step = 1; step < Math.min(maxSteps, height) +1; step++){
            count += findStaircase(height - step, maxSteps);
            System.out.println(count);
        }

        return count;
    }


}
