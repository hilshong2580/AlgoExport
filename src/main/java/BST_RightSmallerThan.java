import java.util.*;

public class BST_RightSmallerThan {

    //the run time is O(n^2) and the space is O(n)
    public static List<Integer> rightSmallerThan(List<Integer> array) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.size(); i++){
            int count = 0;

            for(int j = i+1; j < array.size(); j++){
                if(array.get(i) > array.get(j))
                    count++;
            }
            list.add(count);
        }
        return list;
    }

    //O(nlog(n)) time / O(n) space
    public static List<Integer> rightSmallerThan2(List<Integer> array) {
        if(array.size()==0)
            return new ArrayList<Integer>();

        List<Integer> rightSmallerCounts = new ArrayList<Integer>(array);
        int lastIdx = array.size()-1;
        CustomizeBST bst = new CustomizeBST(array.get(lastIdx));
        rightSmallerCounts.set(lastIdx, 0);
        for(int i = array.size() - 2; i >= 0; i--){
            bst.insert(array.get(i), i, rightSmallerCounts);
        }

        return rightSmallerCounts;
    }

    static class CustomizeBST{
        public int value;
        public int leftSubtreeSize;
        public CustomizeBST left;
        public CustomizeBST right;

        public CustomizeBST(int value){
            this.value = value;
            leftSubtreeSize = 0;
            left = null;
            right = null;
        }

        public void insert(int value, int idx, List<Integer> rightSmallerCounts){
            insertHelper(value, idx, rightSmallerCounts, 0);
        }

        public void insertHelper(int value, int idx, List<Integer> rightSmallerCounts, int numSmallerAtInsertTime){
            if(value < this.value){
                leftSubtreeSize++;
                if(left == null){
                    left = new CustomizeBST(value);
                    rightSmallerCounts.set(idx, numSmallerAtInsertTime);
                } else{
                    left.insertHelper(value, idx, rightSmallerCounts, numSmallerAtInsertTime);
                }
            } else{
                numSmallerAtInsertTime += leftSubtreeSize;
                if(value > this.value) numSmallerAtInsertTime++;
                if(right == null){
                    right = new CustomizeBST(value);
                    rightSmallerCounts.set(idx, numSmallerAtInsertTime);
                } else {
                    right.insertHelper(value, idx, rightSmallerCounts, numSmallerAtInsertTime);
                }
            }
        }
    }
}
