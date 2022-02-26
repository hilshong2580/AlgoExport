import java.util.*;

public class BT_HeightBalancedBinaryTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class NodeInfo {
        public int height;
        public boolean balance;

        public NodeInfo( boolean balance, int height){
            this.height = height;
            this.balance = balance;
        }
    }


    // O(n) || O(h) space
    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        NodeInfo nodeInfo = findBalance(tree);
        return nodeInfo.balance;
    }

    public NodeInfo findBalance(BinaryTree tree){
        if(tree == null)
            return new NodeInfo(true, -1);

        NodeInfo left = findBalance(tree.left);
        NodeInfo right = findBalance(tree.right);

        boolean isBalanced = left.balance && right.balance && Math.abs(left.height - right.height) <= 1;

        int height = Math.max(left.height, right.height) +1;
        return new NodeInfo(isBalanced, height);



    }
}
