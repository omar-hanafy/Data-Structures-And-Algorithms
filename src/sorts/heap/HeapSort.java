package sorts.heap;import trees.heaps.Heap;public class HeapSort {    public int[] heapSort(Heap heap){        int[] sortHeap = new int[heap.size()];        int length = 0;        while (heap.size() > 0) {            System.out.println(heap.peak());            sortHeap[length] = heap.peak();            length++;            heap.delete(0);        }        return sortHeap;    }}