import java.util.*;

public class BinarySearchTrees_BST_Construction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (left == null)
                    left = new BST(value);
                else
                    left.insert(value);
            } else {
                if (right == null)
                    right = new BST(value);
                else
                    right.insert(value);
            }
            return this;
        }

        public boolean contains(int value) {
            if (value == this.value) {
                return true;
            } else {
                if (value < this.value) {
                    if (left != null)
                        return left.contains(value);
                    else return false;
                } else {
                    if (right != null)
                        return right.contains(value);
                    else return false;
                }
            }
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else {
                if (left != null && right != null) {
                    this.value = right.getRightMin();
                    right.remove(this.value, this);
                } else if(parent == null) {
                    if (left != null) {
                        this.value = left.value;
                        left = left.left;
                        right = left.right;
                    } else if (right != null) {
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    } else {
                        System.out.println("this is not BT");
                    }
                }
            }
        }

        public int getRightMin() {
            if (left != null)
                return left.getRightMin();
            else return this.value;
        }
    }
}
