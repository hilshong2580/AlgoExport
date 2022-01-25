import java.util.*;

public class BST_ValidateThreeNodes {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
        if(nodeOne == null || nodeTwo == null || nodeThree == null )
            return false;

        if(checkDescendants(nodeOne, nodeTwo))
            return checkDescendants(nodeTwo, nodeThree);

        if(checkDescendants(nodeThree, nodeTwo))
            return checkDescendants(nodeTwo, nodeOne);

        return false;
    }

    public boolean checkDescendants(BST a, BST b){
        if(a == null || b == null)
            return false;

        if(a == b)
            return true;
        else if(b.value < a.value){
            if(a.left != null)
                return checkDescendants(a.left, b);
            else
                return false;
        }

        else if(b.value > a.value){
            if(a.right != null)
                return checkDescendants(a.right, b);
            else
                return false;
        }

        return false;
    }
}
