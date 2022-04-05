import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class LinkedList_SumOfLinkedListsTest {

    @Test
    void sumOfLinkedLists() {
        LinkedList_SumOfLinkedLists.LinkedList ll1 = addMany(new LinkedList_SumOfLinkedLists.LinkedList(2), new int[] {4, 7, 1});
        LinkedList_SumOfLinkedLists.LinkedList ll2 = addMany(new LinkedList_SumOfLinkedLists.LinkedList(9), new int[] {4, 5});
        LinkedList_SumOfLinkedLists.LinkedList expected = addMany(new LinkedList_SumOfLinkedLists.LinkedList(1), new int[] {9, 2, 2});
        LinkedList_SumOfLinkedLists.LinkedList actual = new LinkedList_SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

    public LinkedList_SumOfLinkedLists.LinkedList addMany(LinkedList_SumOfLinkedLists.LinkedList linkedList, int[] values) {
        LinkedList_SumOfLinkedLists.LinkedList current = linkedList;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList_SumOfLinkedLists.LinkedList(value);
            current = current.next;
        }
        return linkedList;
    }

    public ArrayList<Integer> getNodesInArray(LinkedList_SumOfLinkedLists.LinkedList linkedList) {
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        LinkedList_SumOfLinkedLists.LinkedList current = linkedList;
        while (current != null) {
            nodeValues.add(current.value);
            current = current.next;
        }
        return nodeValues;
    }


}