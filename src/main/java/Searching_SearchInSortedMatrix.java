import java.util.*;

/*
You're give a two-dimensional array (a matrix) of distinct integers and a target integer.
Each two in the matrix is sorted, and each column is also sorted; the matrix doesn't
necessarily have the same height and width.

Write a function that returns an array of the row and column indices of the target integer if it's
contained in the matrix, otherwise[-1, -1].

target = 44;

matrix =
[
  [1,  4,   7,   12,  15,  1000],
  [2,  5,   19,  31,  32,  1001],
  [3,  8,   24,  33,  35,  1002],
  [40, 41,  42,  44,  45,  1003],
  [99, 100, 103, 106, 128, 1004]
]

result [3, 3]

Ideas:
Based on the matrix, we can see that the target num is on the [3, 3] coordinate.
As the matrix is sorted, all the number in target's left side are less than target.
Also, all the numbers above target are less than target too.
So we can conside to start searching the number basic on top right corner.

We know that the same column in all the row, the top number is less than the bottom number.
So, if the column's number large than the target, the same column in all rows also larget than the target.
We can stop searching that column and shift to left column until the column is less than target.
Than shift to next row with that column number to search. Keep the this loop until find the target or end of
the matrix.


*/


public class Searching_SearchInSortedMatrix {
    // The run time complexity should be O(n+m) and space is O(1) space;
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {

        // default the start location at the end of the first row's column
        int row = 0;
        int col = matrix[0].length -1;


        // keep compare the matrix's number with the target
        // if matrix's num less than target move to next row
        // if the matrix's num large than target move to left col
        while( row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
                return new int[] {row, col};
            else if(matrix[row][col] > target)
                col--;
            else if(matrix[row][col] < target)
                row++;
        }

        return new int[] {-1, -1};
    }
}