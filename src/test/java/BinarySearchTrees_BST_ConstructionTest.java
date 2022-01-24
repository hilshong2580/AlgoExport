import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BinarySearchTrees_BST_ConstructionTest {

    @Test
    void moveElementToEnd() {
        BinarySearchTrees_BST_Construction.BST root = new BinarySearchTrees_BST_Construction.BST(10);
        root.left = new BinarySearchTrees_BST_Construction.BST(5);
        root.left.left = new BinarySearchTrees_BST_Construction.BST(2);
        root.left.left.left = new BinarySearchTrees_BST_Construction.BST(1);
        root.left.right = new BinarySearchTrees_BST_Construction.BST(5);
        root.right = new BinarySearchTrees_BST_Construction.BST(15);
        root.right.left = new BinarySearchTrees_BST_Construction.BST(13);
        root.right.left.right = new BinarySearchTrees_BST_Construction.BST(14);
        root.right.right = new BinarySearchTrees_BST_Construction.BST(22);

        root.insert(12);
        assertEquals(root.right.left.left.value, 12);

        root.remove(10);
        assertTrue(root.contains(10) == false);
        assertTrue(root.value == 12);

        assertTrue(root.contains(15));
    }

}