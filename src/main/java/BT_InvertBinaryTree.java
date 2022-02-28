import java.util.*;

public class BT_InvertBinaryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        if(tree == null)
            return;
        invertBT(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    public static void invertBT(BinaryTree newTree){
        BinaryTree left = newTree.left;
        newTree.left = newTree.right;
        newTree.right = left;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
