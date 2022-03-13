import java.util.*;

public class Graphs_RemoveIsland {
    /* The time complexity is O(wh) and the space is O(wh)*/
    public int[][] removeIslands(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        /* Use two for loop to check the island near border or not*/
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){

                //Use the boolean check to find the island near border
                boolean upDown = (i == 0) || (i==matrix.length-1);
                boolean leftRight = (j == 0) || (j==matrix[i].length-1);
                boolean border = upDown || leftRight;

                //skip the element if not near the border
                if(!border)
                    continue;

                //skip the element if already visited
                if(visited[i][j])
                    continue;

                //check the coordinate element and update visited
                checkIsland(i, j, matrix, visited);
            }
        }

        //based on visited, if not visited yet, it is not connect to the border
        // update the element to 0 from 1
        for(int i = 0; i < visited.length; i++){
            for(int j = 0; j < visited[0].length; j++){
                if(!visited[i][j])
                    matrix[i][j] = 0;
            }
        }

        return matrix;
    }


    public void checkIsland(int i, int j, int[][] matrix, boolean[][] visited){

        /*create a stack to store the input coordinate*/
        Stack<int[]> explores = new Stack<>();
        explores.push(new int[] {i, j});


        //keep finding the neighbors if the stack is not empty
        while(!explores.isEmpty()){
            int[] check = explores.pop();
            int row = check[0];
            int col = check[1];

            visited[row][col] = true;

            if(matrix[row][col] == 0)
                continue;

            //find the coordinate up, down, left and right
            List<Integer[]> neighbors = findNeighbors(matrix, row, col, visited);
            for(Integer[] x: neighbors){
                int h = x[0];
                int k = x[1];
                explores.push(new int[] {h, k});
            }
        }
    }

    //Return the List to check function which is near border, element is 1 and not visited yet.
    public List<Integer[]> findNeighbors(int[][] matrix, int i, int j, boolean[][] visited){
        List<Integer[]> neighbors = new LinkedList<Integer[]>();

        if( i-1 >= 0 && matrix[i-1][j] != 0 && !visited[i-1][j])
            neighbors.add(new Integer[]{i-1, j});

        if( i+1 <= matrix.length-1 && matrix[i+1][j] != 0 && !visited[i+1][j])
            neighbors.add(new Integer[]{i+1, j});

        if( j-1 >= 0 && matrix[i][j-1] != 0 && !visited[i][j-1])
            neighbors.add(new Integer[]{i, j-1});

        if( j+1 <= matrix[i].length-1 && matrix[i][j+1] != 0 && !visited[i][j+1])
            neighbors.add(new Integer[]{i, j+1});

        return neighbors;
    }
}
