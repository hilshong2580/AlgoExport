import java.util.*;


public class LinkedList_RemoveDuplicatesFromLinkedList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.

        LinkedList linked = linkedList;
        while(linked != null){
            LinkedList next = linked.next;
            while( next != null && linked.value == next.value){
                next = next.next;
            }
            linked.next = next;
            linked = next;

        }




        return linkedList;
    }

}
