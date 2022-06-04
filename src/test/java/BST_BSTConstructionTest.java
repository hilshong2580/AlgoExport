import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BST_BSTConstructionTest {

    @Test
    void testCase1(){

        BST_BSTConstruction.BST root = new BST_BSTConstruction.BST(10);
        root.left = new BST_BSTConstruction.BST(5);
        root.left.left = new BST_BSTConstruction.BST(2);
        root.left.left.left = new BST_BSTConstruction.BST(1);
        root.left.right = new BST_BSTConstruction.BST(5);
        root.right = new BST_BSTConstruction.BST(15);
        root.right.left = new BST_BSTConstruction.BST(13);
        root.right.left.right = new BST_BSTConstruction.BST(14);
        root.right.right = new BST_BSTConstruction.BST(22);

        root.insert(12);
        assertTrue(root.right.left.left.value == 12);

        root.remove(10);
        assertTrue(root.contains(10) == false);
        assertTrue(root.value == 12);

        assertTrue(root.contains(15));
    }
}