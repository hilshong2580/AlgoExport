import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BT_HeightBalancedBinaryTreeTest {

    @Test
    void heightBalancedBinaryTree() {
        BT_HeightBalancedBinaryTree.BinaryTree root = new BT_HeightBalancedBinaryTree.BinaryTree(1);
        root = new BT_HeightBalancedBinaryTree.BinaryTree(1);
        root.left = new BT_HeightBalancedBinaryTree.BinaryTree(2);
        root.right = new BT_HeightBalancedBinaryTree.BinaryTree(3);
        root.left.left = new BT_HeightBalancedBinaryTree.BinaryTree(4);
        root.left.right = new BT_HeightBalancedBinaryTree.BinaryTree(5);
        root.right.right = new BT_HeightBalancedBinaryTree.BinaryTree(6);
        root.left.right.left = new BT_HeightBalancedBinaryTree.BinaryTree(7);
        root.left.right.right = new BT_HeightBalancedBinaryTree.BinaryTree(8);
        boolean expected = true;
        boolean actual = new BT_HeightBalancedBinaryTree().heightBalancedBinaryTree(root);
        assertEquals(actual, expected);
    }
}