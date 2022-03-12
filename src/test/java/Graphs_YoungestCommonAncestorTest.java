import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class Graphs_YoungestCommonAncestorTest {

    public HashMap<Character, Graphs_YoungestCommonAncestor.AncestralTree> getTrees() {
        HashMap<Character, Graphs_YoungestCommonAncestor.AncestralTree> trees = new HashMap<Character, Graphs_YoungestCommonAncestor.AncestralTree>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char a : alphabet.toCharArray()) {
            trees.put(a, new Graphs_YoungestCommonAncestor.AncestralTree(a));
        }

        trees
                .get('A')
                .addAsAncestor(
                        new Graphs_YoungestCommonAncestor.AncestralTree[] {
                                trees.get('B'), trees.get('C'), trees.get('D'), trees.get('E'), trees.get('F')
                        });
        return trees;
    }

    @Test
    void getYoungestCommonAncestor() {
        //Graphs_YoungestCommonAncestor
        HashMap<Character, Graphs_YoungestCommonAncestor.AncestralTree> trees = getTrees();
        trees.get('A').addAsAncestor(new Graphs_YoungestCommonAncestor.AncestralTree[] {trees.get('B'), trees.get('C')});
        trees.get('B').addAsAncestor(new Graphs_YoungestCommonAncestor.AncestralTree[] {trees.get('D'), trees.get('E')});
        trees.get('D').addAsAncestor(new Graphs_YoungestCommonAncestor.AncestralTree[] {trees.get('H'), trees.get('I')});
        trees.get('C').addAsAncestor(new Graphs_YoungestCommonAncestor.AncestralTree[] {trees.get('F'), trees.get('G')});

        Graphs_YoungestCommonAncestor.AncestralTree yca = Graphs_YoungestCommonAncestor.getYoungestCommonAncestor(trees.get('A'), trees.get('E'), trees.get('I'));
        assertTrue(yca == trees.get('B'));
    }
}