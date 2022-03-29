import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class LinkedList_LinkedListConstructionTest {

    private List<Integer> getNodeValuesHeadToTail(LinkedList_LinkedListConstruction.DoublyLinkedList linkedList) {
        List<Integer> values = new ArrayList<Integer>();
        LinkedList_LinkedListConstruction.Node node = linkedList.head;
        while (node != null) {
            values.add(node.value);
            node = node.next;
        }
        return values;
    }

    private List<Integer> getNodeValuesTailToHead(LinkedList_LinkedListConstruction.DoublyLinkedList linkedList) {
        List<Integer> values = new ArrayList<Integer>();
        LinkedList_LinkedListConstruction.Node node = linkedList.tail;
        while (node != null) {
            values.add(node.value);
            node = node.prev;
        }
        return values;
    }

    private void bindNodes(LinkedList_LinkedListConstruction.Node nodeOne, LinkedList_LinkedListConstruction.Node nodeTwo) {
        nodeOne.next = nodeTwo;
        nodeTwo.prev = nodeOne;
    }

    private boolean compare(List<Integer> array1, int[] array2) {
        if (array1.size() != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) != array2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1(){
        LinkedList_LinkedListConstruction.DoublyLinkedList linkedList = new LinkedList_LinkedListConstruction.DoublyLinkedList();
        LinkedList_LinkedListConstruction.Node one = new LinkedList_LinkedListConstruction.Node(1);
        LinkedList_LinkedListConstruction.Node two = new LinkedList_LinkedListConstruction.Node(2);
        LinkedList_LinkedListConstruction.Node three = new LinkedList_LinkedListConstruction.Node(3);
        LinkedList_LinkedListConstruction.Node three2 = new LinkedList_LinkedListConstruction.Node(3);
        LinkedList_LinkedListConstruction.Node three3 = new LinkedList_LinkedListConstruction.Node(3);
        LinkedList_LinkedListConstruction.Node four = new LinkedList_LinkedListConstruction.Node(4);
        LinkedList_LinkedListConstruction.Node five = new LinkedList_LinkedListConstruction.Node(5);
        LinkedList_LinkedListConstruction.Node six = new LinkedList_LinkedListConstruction.Node(6);
        bindNodes(one, two);
        bindNodes(two, three);
        bindNodes(three, four);
        bindNodes(four, five);
        linkedList.head = one;
        linkedList.tail = five;

        linkedList.setHead(four);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {5, 3, 2, 1, 4}));

        linkedList.setTail(six);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 3, 5, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 3, 2, 1, 4}));

        linkedList.insertBefore(six, three);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 3, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 3, 5, 2, 1, 4}));

        linkedList.insertAfter(six, three2);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 3, 6, 3}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {3, 6, 3, 5, 2, 1, 4}));

        linkedList.insertAtPosition(1, three3);
        assertTrue(
                compare(getNodeValuesHeadToTail(linkedList), new int[] {3, 4, 1, 2, 5, 3, 6, 3}));
        assertTrue(
                compare(getNodeValuesTailToHead(linkedList), new int[] {3, 6, 3, 5, 2, 1, 4, 3}));

        linkedList.removeNodesWithValue(3);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 2, 5, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 2, 1, 4}));

        linkedList.remove(two);
        assertTrue(compare(getNodeValuesHeadToTail(linkedList), new int[] {4, 1, 5, 6}));
        assertTrue(compare(getNodeValuesTailToHead(linkedList), new int[] {6, 5, 1, 4}));

        assertTrue(linkedList.containsNodeWithValue(5));
    }
}