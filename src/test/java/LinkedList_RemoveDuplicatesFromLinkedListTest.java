import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class LinkedList_RemoveDuplicatesFromLinkedListTest {

    public LinkedList_RemoveDuplicatesFromLinkedList.LinkedList addMany(LinkedList_RemoveDuplicatesFromLinkedList.LinkedList ll, List<Integer> values) {
        LinkedList_RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current.next != null) {
            current = current.next;
        }
        for (int value : values) {
            current.next = new LinkedList_RemoveDuplicatesFromLinkedList.LinkedList(value);
            current = current.next;
        }
        return ll;
    }

    public List<Integer> getNodesInArray(LinkedList_RemoveDuplicatesFromLinkedList.LinkedList ll) {
        List<Integer> nodes = new ArrayList<Integer>();
        LinkedList_RemoveDuplicatesFromLinkedList.LinkedList current = ll;
        while (current != null) {
            nodes.add(current.value);
            current = current.next;
        }
        return nodes;
    }

    @Test
    void removeDuplicatesFromLinkedList() {
        LinkedList_RemoveDuplicatesFromLinkedList.LinkedList input = new LinkedList_RemoveDuplicatesFromLinkedList.LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        LinkedList_RemoveDuplicatesFromLinkedList.LinkedList output = new LinkedList_RemoveDuplicatesFromLinkedList().removeDuplicatesFromLinkedList(input);
        assertTrue(getNodesInArray(output).equals(expectedNodes));
    }
}