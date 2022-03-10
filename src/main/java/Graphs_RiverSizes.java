import java.util.*;
public class Graphs_RiverSizes {
    //O(wh) time and O(wh) space
    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];


        /*use two for loop to check all matrix points */
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(visited[i][j])
                    continue;
                findRivers(list, visited, matrix, i, j);
            }
        }

        return list;
    }

    /*
    This function use to count the number of river exist based on the input row and column.
    Use the Stack to store the coordinate which need to explore, mark the coordinates is visited
    if already explored.

    To keep the visited coordinate, use the continue if visited or is land.
    */
    public static void findRivers(
            List<Integer> list, boolean[][] visited, int[][] matrix, int i, int j){
        Integer count = 0;
        Stack<Integer[]> explore = new Stack<>();
        explore.push(new Integer[] {i, j});

        while(!explore.empty()){
            Integer[] currentNode = explore.pop();
            i = currentNode[0];
            j = currentNode[1];

            if(visited[i][j])
                continue;

            visited[i][j] = true;

            if(matrix[i][j] == 0)
                continue;

            count++;
            List<Integer[]> neighbors = findNeighbor(matrix, visited, i, j);
            for(Integer[] x: neighbors)
                explore.push(x);
        }
        if(count > 0)
            list.add(count);
    }



    /*
    This is a function to find the neighbor's river based on the input row and column.
    If the neighbors in not visited and in side the matrix range, add them in to a list.
    Then return to this list for the explore search.
    */
    public static List<Integer[]> findNeighbor(int[][] matrix, boolean[][] visited, int i, int j){
        List<Integer[]> neighbors = new ArrayList<>();

        if(i>0 && !visited[i-1][j])
            neighbors.add(new Integer[] {i-1, j});

        if(i<matrix.length-1 && !visited[i+1][j])
            neighbors.add(new Integer[] {i+1, j});

        if(j>0 && !visited[i][j-1])
            neighbors.add(new Integer[] {i, j-1});

        if(j< matrix[0].length-1 && !visited[i][j+1])
            neighbors.add(new Integer[] {i, j+1});

        return neighbors;
    }
}
