import java.util.*;
public class BT_FindSuccessor {

    // O(n) time and O(n) space
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        ArrayList<BinaryTree> list = new ArrayList<>();
        findNode(tree, list);

        for(int i = 0; i < list.size(); i++){
            BinaryTree current = list.get(i);

            if(current == node){
                if(i == list.size()-1)
                    return null;

                return list.get(i+1);
            }
        }
        return null;
    }

    public void findNode(BinaryTree tree, ArrayList<BinaryTree> list){
        if(tree == null)
            return;
        findNode(tree.left, list);
        list.add(tree);
        findNode(tree.right, list);
    }

    //////////////////////////////////////////////////////////////////////////////
    //O(h) time and O(1) space

    public BinaryTree findSuccessor2(BinaryTree tree, BinaryTree node) {
        if(node.right != null)
            return getLeftmostChild(node.right);

        return getRightmostParent(node);
    }

    public BinaryTree getLeftmostChild(BinaryTree node){
        BinaryTree currentNode = node;
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode;
    }

    public BinaryTree getRightmostParent(BinaryTree node){
        BinaryTree currentNode = node;
        while(currentNode.parent != null && currentNode.parent.right == currentNode){
            currentNode = currentNode.parent;
        }
        return currentNode.parent;
    }



}
