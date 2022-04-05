import java.util.*;


public class LinkedList_SumOfLinkedLists {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        int remainder = 0;
        int addToNext = 0;

        LinkedList list = new LinkedList(0);
        LinkedList ptr = list;
        LinkedList ptrOne = linkedListOne;
        LinkedList ptrTwo = linkedListTwo;

        while(ptrOne != null || ptrTwo != null || addToNext != 0){
            int one = 0, two = 0, sum = 0;

            if(ptrOne!=null)
                one = ptrOne.value;

            if(ptrTwo!=null)
                two = ptrTwo.value;

            sum = one + two + addToNext;
            remainder = sum % 10;
            addToNext = (sum - remainder)/10;

            System.out.println(addToNext+" "+remainder);

            LinkedList temp = new LinkedList(remainder);
            ptr.next = temp;
            ptr = temp;
            remainder = 0;



            if(ptrOne!=null)
                ptrOne = ptrOne.next;

            if(ptrTwo!=null)
                ptrTwo = ptrTwo.next;

        }

        return list.next;
    }
}
