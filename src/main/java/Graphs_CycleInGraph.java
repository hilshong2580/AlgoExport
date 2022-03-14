import java.util.*;

public class Graphs_CycleInGraph {

    public boolean cycleInGraph(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        boolean[] inStack = new boolean[edges.length];
        Arrays.fill(visited, false);
        Arrays.fill(inStack, false);

        for(int i = 0; i < edges.length; i++){
            if(visited[i])
                continue;

            if(checkCycle(i, edges, visited, inStack))
                return true;
        }
        return false;
    }

    public boolean checkCycle(int node, int[][] edges, boolean[] visited, boolean[] inStack){
        visited[node] = true;
        inStack[node] = true;

        boolean check = false;
        int[] neighbors = edges[node];
        for(int neighbor: neighbors){

            if(!visited[neighbor])
                check = checkCycle(neighbor, edges, visited, inStack);

            if(check)
                return true;
            else if(inStack[neighbor])
                return true;
        }
        inStack[node] = false;
        return false;
    }
}
