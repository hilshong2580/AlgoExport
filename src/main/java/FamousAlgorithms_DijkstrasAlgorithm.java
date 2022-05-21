import java.util.*;


/*

You're given an integeer "start" and a list "edges" of pairs of integers.

The list is what's called an adjacenty list, and it represents a graph. The number of
vertices in the graph is equal to length of edges, where each index "i" in "edgs" contains
vertex i's outbound edges, in no particular order. Each individual edge is represented by an pair
of two numbers, [destination, distance], where the destination is a positive integer denoting the
destination vertex and the distance is a postive integer representing the length of the edge
(the distance from vertex i to vertex destination). Note that these edges are directed, meaning
that you can only travel from a particular vertex to its destination-- not the other way around
(unless the destination vertex itself has an outbound edge to the original vertex).

Write a function that computes the lengths of the shortest paths between start and all of the other
vertices in the graph using Dijstra's algorithm and returns them in an array. Each index i in the
output array should represent the length of the shortest path between start and vertex i. If no path
is found from start to vertex i, then output[i] should be -1.

Note that the graph represented by edges won't contain any self-loop (vertices that have an outbound
edge to themselves) and will only have positively weighted edges (i.e. no negative distances).

Idea:
The key point: Queue, Map<>, Array
Use the Queue to store the processing vertex because FIFO
Use the array to store the minimum distances and default the beginning distance as MAX_VALUE means unreachable

Using the while loop keep run until Queue is empty
- use a for loop to put all the vertex and distance to map
- store the vertex to Queue if the currentDistance + vertexDistance is shorter than array's minDistance

Update the Array MAX_VALUE to -1 as unreachable

*/

public class FamousAlgorithms_DijkstrasAlgorithm {
    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        Queue<Integer> queue = new LinkedList<>(); // queue to store the proceesing vertex, FIFO
        int size = edges.length;		// the number of vertex
        int[] minDistance = new int[size];	// the return result for minimum distances
        Arrays.fill(minDistance, Integer.MAX_VALUE);	// default all vertex is not connected
        minDistance[start] = 0;		// set the start vertex's distance is zero

        queue.add(start);	// add the processing vertex to queue

        while(queue.size() != 0){
            // get the current vertex and distance
            int node = queue.peek();
            int current = minDistance[node];

            // store the available connect vertex and distance to map
            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < edges[node].length; i++){
                map.put(edges[node][i][0], edges[node][i][1]);
            }

            // sort the map by value in ACS order
            map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue());

            // add the available data to queue if the new distance is shorter.
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if((entry.getValue()+current) < minDistance[entry.getKey()]){
                    minDistance[entry.getKey()] = entry.getValue()+current;
                    queue.add(entry.getKey());
                }
            }

            // finish current node. remove it from queue
            queue.remove();
        }

        // set the unreachable vertex's distance as -1
        for(int i = 0; i < minDistance.length; i++){
            if (minDistance[i] == Integer.MAX_VALUE)
                minDistance[i] = -1;
        }

        return minDistance;
    }
}
