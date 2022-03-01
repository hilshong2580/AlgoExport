import java.util.*;

public class BT_NodeDepths {
    public static int nodeDepths(BinaryTree root) {
        List<Integer> sum = new ArrayList<Integer>();
        findDeep(root, sum, -1);
        int total = 0;

        for(Integer x : sum)
            total +=x;

        return total;
    }

    public static void findDeep(BinaryTree root, List<Integer> sum, int level){
        if(root == null)
            return;

        int currentLevel = level + 1;

        if(root.left != null)
            findDeep(root.left, sum, currentLevel);

        if(root.right != null)
            findDeep(root.right, sum, currentLevel);

        sum.add(currentLevel);
        return;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
