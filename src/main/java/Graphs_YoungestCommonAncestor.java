import java.util.*;

public class Graphs_YoungestCommonAncestor {
    /* To Find the common youngest ancestor in the tree structure.
	Step:
	1. Find the depthest descendant from the given descendants. Return the number of depth.
	2. Calculate the different between two descendant's depth, raise the depthesst descendant
		to the same level to another descendant.
	3. Keep rise this two descendant until have the both descendant have the same ancestor
		which is the youngest ancestor.
	*/

    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {

        int one = findDescendant(topAncestor, descendantOne);
        int two = findDescendant(topAncestor, descendantTwo);
        System.out.println(one+" "+ two);
        if(one > two)
            return commonAncestor(descendantOne, descendantTwo, one-two);
        else
            return commonAncestor(descendantTwo, descendantOne, two - one);
    }

    public static int findDescendant(AncestralTree topAncestor, AncestralTree descendant){
        int depth = 0;
        while(descendant != topAncestor){
            depth++;
            descendant = descendant.ancestor;
        }
        return depth;
    }

    public static AncestralTree commonAncestor(
            AncestralTree descendantLow, AncestralTree descendantHigh, int different){

        while(different > 0){
            descendantLow = descendantLow.ancestor;
            different--;
        }

        while(descendantLow != descendantHigh){
            descendantLow = descendantLow.ancestor;
            descendantHigh = descendantHigh.ancestor;
        }
        return descendantLow;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
