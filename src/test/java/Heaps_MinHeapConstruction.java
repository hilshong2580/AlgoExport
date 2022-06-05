import java.util.*;

/*
Implement a MinHeap class that supports:
1. Building a Min Heap from an input array of integers.
2. Insert integers in the heap.
3. Removing the heap's minimum /root value.
4. Peeking at the heap's minimum /root value.
5. Sifting integers up and down the heap, which is to be used when
inserting and removing values.

Note that the heap should be represented in the form of an array.


*/


// Do not edit the class below except for the buildHeap,
// siftDown, siftUp, peek, remove, and insert methods.
// Feel free to add new properties and methods to the class.

public class Heaps_MinHeapConstruction {
    static class MinHeap {
        List<Integer> heap = new ArrayList<Integer>();

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        //O(n) time and O(1) space
        public List<Integer> buildHeap(List<Integer> array) {
            int startIdx = (array.size() -2 )/2;

            for(int i = startIdx; i >= 0; i--){
                siftDown(i, array.size()-1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = currentIdx * 2 + 1;
            while(childOneIdx <= endIdx){
                int childTwoIdx = currentIdx * 2 + 2 <= endIdx ? currentIdx * 2 + 2 : -1;
                int idxToSwap;
                if(childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)){
                    idxToSwap = childOneIdx;
                } else{
                    idxToSwap = childOneIdx;
                }
                if(heap.get(idxToSwap) < heap.get(currentIdx)){
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = currentIdx * 2 + 1;
                } else{
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int parentIdx = (currentIdx -1 )/2;
            while( currentIdx > 0 && heap.get(currentIdx) < heap.get(parentIdx)){
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
        }

        public int peek() {
            return heap.get(0);

        }

        public int remove() {
            // Write your code here.
            swap(0, heap.size() -1, heap);
            int value = heap.get(heap.size()-1);
            heap.remove(heap.size() -1);
            siftDown(0, heap.size() - 1, heap);
            return value;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size()-1, heap);
        }

        public void swap(int i, int j, List<Integer> heap){
            Integer temp = heap.get(j);
            heap.set(j, heap.get(i));
            heap.set(i, temp);
        }
    }
}
