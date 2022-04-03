import java.util.*;

public class LinkedList_RemoveKthNodeFromEnd {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        // Write your code here.
        LinkedList target = head;
        LinkedList current = head;
        int count = 0;

        while(current.next != null){
            count++;

            if(count > k)
                target = target.next;

            current = current.next;


        }
        if(k > count){
            head.value = head.next.value;
            head.next = head.next.next;
        } else
            target.next = target.next.next;

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
