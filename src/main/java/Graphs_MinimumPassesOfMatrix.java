import java.util.*;

public class Graphs_MinimumPassesOfMatrix {
    public int minimumPassesOfMatrix(int[][] matrix) {
        int passes = findPasses(matrix);
        if(checkNegative(matrix))
            return -1;
        return passes-1;
    }

    public int findPasses(int[][] matrix){
        ArrayList<int[]> list = findPositive(matrix);
        int passes = 0;

        while(list.size() > 0){
            int currentSize = list.size();
            while(currentSize > 0){

                int row = list.get(0)[0];
                int col = list.get(0)[1];
                list.remove(0);
                ArrayList<int[]> negativePosition = findAdjacentPosition( row, col, matrix);

                for(int[] x: negativePosition)
                    if(matrix[x[0]][x[1]] < 0){
                        matrix[x[0]][x[1]] = matrix[x[0]][x[1]] * -1;
                        list.add(new int[]{x[0], x[1]});
                    }
                currentSize--;
            }
            passes++;
        }
        return passes;
    }

    public ArrayList<int[]> findAdjacentPosition(int row, int col, int[][] matrix){
        ArrayList<int[]> list = new ArrayList<>();

        if(row > 0)
            list.add(new int[]{row - 1, col});

        if(row < matrix.length-1)
            list.add(new int[]{row +1, col});

        if(col> 0)
            list.add(new int[]{row, col-1});

        if(col < matrix[row].length-1)
            list.add(new int[]{row, col+1});

        return list;
    }

    public ArrayList<int[]> findPositive(int[][] matrix){
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                if(matrix[i][j] >0){
                    list.add(new int[]{ i, j});
                }
            }
        }
        return list;
    }

    public boolean checkNegative(int[][] matrix){
        for(int i = 0; i<matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] <0)
                    return true;

        return false;
    }
}
