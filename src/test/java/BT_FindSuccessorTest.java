import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class BT_FindSuccessorTest {

    @Test
    void findSuccessor() {
        BT_FindSuccessor.BinaryTree root = new BT_FindSuccessor.BinaryTree(1);
        root.left = new BT_FindSuccessor.BinaryTree(2);
        root.left.parent = root;
        root.right = new BT_FindSuccessor.BinaryTree(3);
        root.right.parent = root;
        root.left.left = new BT_FindSuccessor.BinaryTree(4);
        root.left.left.parent = root.left;
        root.left.right = new BT_FindSuccessor.BinaryTree(5);
        root.left.right.parent = root.left;
        root.left.left.left = new BT_FindSuccessor.BinaryTree(6);
        root.left.left.left.parent = root.left.left;
        BT_FindSuccessor.BinaryTree node = root.left.right;
        BT_FindSuccessor.BinaryTree expected = root;
        BT_FindSuccessor.BinaryTree output = new BT_FindSuccessor().findSuccessor(root, node);
        assert (expected == output);
    }

    @Test
    void findSuccessor2() {
        BT_FindSuccessor.BinaryTree root = new BT_FindSuccessor.BinaryTree(1);
        root.left = new BT_FindSuccessor.BinaryTree(2);
        root.left.parent = root;
        root.right = new BT_FindSuccessor.BinaryTree(3);
        root.right.parent = root;
        root.left.left = new BT_FindSuccessor.BinaryTree(4);
        root.left.left.parent = root.left;
        root.left.right = new BT_FindSuccessor.BinaryTree(5);
        root.left.right.parent = root.left;
        root.left.left.left = new BT_FindSuccessor.BinaryTree(6);
        root.left.left.left.parent = root.left.left;
        BT_FindSuccessor.BinaryTree node = root.left.right;
        BT_FindSuccessor.BinaryTree expected = root;
        BT_FindSuccessor.BinaryTree output = new BT_FindSuccessor().findSuccessor2(root, node);
        assert (expected == output);
    }
}