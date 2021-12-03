package trees.heaps;

import sorts.heap.HeapSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(8);
        int[] arr = {80, 75, 60, 68, 55, 40, 52, 67};
        for (int i = 0; i <= arr.length - 1; i++) {
            heap.insert(arr[i]);
            System.out.println(heap.isFull());
        }
//        heap.printHeap();
//
//        System.out.println("-------------------------");
//        System.out.println(heap.isFull());
//
//        heap.delete(5);
//        heap.printHeap();
//        heap.insert(20);
//        heap.printHeap();
//
        HeapSort sortHeap = new HeapSort();

        System.out.println(Arrays.toString(sortHeap.heapSort(heap)));
        heap.printHeap();
    }
}