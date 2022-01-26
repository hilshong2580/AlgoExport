import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BT_BinaryTreeDiameterTest {

    @Test
    void binaryTreeDiameter() {
        TestBinaryTree input = new TestBinaryTree(1);
        input.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
        int expected = 4;
        int actual = new BT_BinaryTreeDiameter().binaryTreeDiameter(input);
        assertTrue(expected == actual);
    }

    class TestBinaryTree extends BT_BinaryTreeDiameter.BinaryTree {
        public TestBinaryTree(int value) {
            super(value);
        }

        public void insert(int[] values, int i) {
            if (i >= values.length) {
                return;
            }
            ArrayDeque<BT_BinaryTreeDiameter.BinaryTree> queue = new ArrayDeque<BT_BinaryTreeDiameter.BinaryTree>();
            queue.addLast(this);
            while (queue.size() > 0) {
                BT_BinaryTreeDiameter.BinaryTree current = queue.pollFirst();
                if (current.left == null) {
                    current.left = new BT_BinaryTreeDiameter.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.left);
                if (current.right == null) {
                    current.right = new BT_BinaryTreeDiameter.BinaryTree(values[i]);
                    break;
                }
                queue.addLast(current.right);
            }
            insert(values, i + 1);
        }
    }

}