import java.util.*;

public class Graphs_DepthFirstSearch {
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(this.name);

            if(this.children.size() <= 0)
                return array;

            for(int i = 0; i< this.children.size(); i++)
                array = this.children.get(i).depthFirstSearch(array);

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
