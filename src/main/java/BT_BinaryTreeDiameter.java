import java.util.*;

public class BT_BinaryTreeDiameter {
    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    static class Content{
        public int height;
        public int longest;

        public Content(int height, int longest){
            this.height = height;
            this.longest = longest;
        }
    }

    public int binaryTreeDiameter(BinaryTree tree) {
        // Write your code here.
        Content content = findLongest(tree);

        return content.longest;
    }

    public Content findLongest(BinaryTree tree){
        Content leftContent = null;
        Content rightContent = null;

        if(tree.left == null && tree.right == null)
            return new Content(0, 0);
        else{
            if(tree.left != null){
                leftContent = findLongest(tree.left);
            } else
                leftContent = null;

            if(tree.right != null){
                rightContent = findLongest(tree.right);
            } else
                rightContent = null;
        }

        int leftLong = 0, rightLong = 0, leftHeight = 0, rightHeight = 0;

        if(leftContent != null){
            leftHeight = leftContent.height+1;
            leftLong = leftContent.longest;
        }

        if(rightContent != null){
            rightHeight = rightContent.height+1;
            rightLong = rightContent.longest;
        }

        int sum = leftHeight + rightHeight;
        int longest = Math.max(Math.max(leftLong, rightLong), sum);
        int heightest = Math.max(leftHeight, rightHeight);

        return new Content(heightest, longest);
    }
}
