import java.util.*;


public class BT_BranchSums {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sum = new ArrayList<Integer>();
        findDeep(root, 0, sum);
        return sum;
    }

    public static void findDeep(BinaryTree root, int num, List<Integer> sum){
        if(root==null)
            return;

        int current = num + root.value;
        if(root.left == null && root.right == null){
            sum.add(current);
            return;
        }
        findDeep(root.left, current, sum);
        findDeep(root.right, current, sum);
    }
}
