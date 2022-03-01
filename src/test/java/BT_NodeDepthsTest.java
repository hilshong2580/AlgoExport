import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BT_NodeDepthsTest {

    @Test
    void nodeDepths() {
        BT_NodeDepths.BinaryTree root = new BT_NodeDepths.BinaryTree(1);
        root.left = new BT_NodeDepths.BinaryTree(2);
        root.left.left = new BT_NodeDepths.BinaryTree(4);
        root.left.left.left = new BT_NodeDepths.BinaryTree(8);
        root.left.left.right = new BT_NodeDepths.BinaryTree(9);
        root.left.right = new BT_NodeDepths.BinaryTree(5);
        root.right = new BT_NodeDepths.BinaryTree(3);
        root.right.left = new BT_NodeDepths.BinaryTree(6);
        root.right.right = new BT_NodeDepths.BinaryTree(7);
        int actual = BT_NodeDepths.nodeDepths(root);
        assertEquals(16, actual);
    }

    static class BinaryTree {
        int value;
        BT_NodeDepths.BinaryTree left;
        BT_NodeDepths.BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}