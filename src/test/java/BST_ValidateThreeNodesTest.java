import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class BST_ValidateThreeNodesTest {

    @Test
    void validateThreeNodes() {
        BST_ValidateThreeNodes.BST root = new BST_ValidateThreeNodes.BST(5);
        root.left = new BST_ValidateThreeNodes.BST(2);
        root.right = new BST_ValidateThreeNodes.BST(7);
        root.left.left = new BST_ValidateThreeNodes.BST(1);
        root.left.right = new BST_ValidateThreeNodes.BST(4);
        root.right.left = new BST_ValidateThreeNodes.BST(6);
        root.right.right = new BST_ValidateThreeNodes.BST(8);
        root.left.left.left = new BST_ValidateThreeNodes.BST(0);
        root.left.right.left = new BST_ValidateThreeNodes.BST(3);

        BST_ValidateThreeNodes.BST nodeOne = root;
        BST_ValidateThreeNodes.BST nodeTwo = root.left;
        BST_ValidateThreeNodes.BST nodeThree = root.left.right.left;
        boolean expected = true;
        boolean actual = new BST_ValidateThreeNodes().validateThreeNodes(nodeOne, nodeTwo, nodeThree);
        assertEquals(actual, expected);
    }
}