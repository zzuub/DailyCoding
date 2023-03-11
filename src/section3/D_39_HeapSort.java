package section3;

import java.util.PriorityQueue;

public class D_39_HeapSort {
    public int[] heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
