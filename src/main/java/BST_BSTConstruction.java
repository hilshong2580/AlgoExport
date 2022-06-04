import java.util.*;

/*
Write a BST class for a Binary Search Tree. The class should support:
1. Inserting values with the "insert" method.
2. Removing values with the "remove" method; this method should only remove the first instance
of a given value.
3. Searching for values with the contains method.

Note that you can't remove values from a single-node tree. In other words, calling the remove method
on a single-node tree should simply not do anything.

Each "BST" node has an integer "value", a "left" child node, and a "right" child node. A node is said
to be a valid "BST" node if and only if it satisfies the BST property: Its value is strictly greater
than the values of every node to its left; its "value" is less than or equal to the values of every
node to its right; and its children nodes are either valid BST nodes themselves or None/null.

Ideas:

The Binary Search Tree contains the insert, contains, and removes methods.

*/


public class BST_BSTConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            if(value < this.value){
                if (left == null){
                    BST bst = new BST(value);
                    left = bst;
                } else left.insert(value);
            } else {
                if(right == null){
                    BST bst = new BST(value);
                    right = bst;
                } else right.insert(value);
            }
            return this;
        }

        public boolean contains(int value) {
            if(value == this.value){
                return true;
            } else if (value < this.value){
                if(left == null)
                    return false;
                return left.contains(value);
            } else if (value > this.value){
                if(right == null)
                    return false;
                return right.contains(value);
            } else return false;
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent){
            if(value < this.value){
                if(left != null)
                    left.remove(value, this);
            } else if( value > this.value){
                if(right != null)
                    right.remove(value, this);
            } else {
                if( left != null && right != null){
                    this.value = right.getMin();
                    right.remove(this.value, this);
                } else if( parent == null){
                    if(left != null){
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    } else if(right != null){
                        this.value = right.value;
                        right = right.right;
                        left = right.left;
                    } else {

                    }
                } else if(parent.left == this){
                    parent.left = left != null ? left : right;
                } else if(parent.right == this){
                    parent.right = left != null ? left : right;
                }
            }
        }

        public int getMin(){
            if(left == null){
                return this.value;
            } else
                return left.getMin();
        }

    }
}
