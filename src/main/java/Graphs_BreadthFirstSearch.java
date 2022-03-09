import java.util.*;

public class Graphs_BreadthFirstSearch {

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
      /* I use the Queue as a list to store the Node object with LinkedList.
			Based on the FIFO, The program will visit the node by input order. It is layer to layer.
			Even program put the layer 3 node into queue, If there still exist perious layer's node.
			It will process that first before the new input node.*/
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(this);


            /* In this part, the while will keep process the exist node until end.*/
            while(!queue.isEmpty()){
                Node current = queue.poll();
                array.add(current.name);
                queue.addAll(current.children);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
