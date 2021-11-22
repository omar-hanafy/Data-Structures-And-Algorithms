package sorts.bucket;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };
        bucketSort(intArray);
        System.out.println(Arrays.toString(intArray));

    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using linked lists for the buckets
            //buckets[i] = new LinkedList<Integer>();

            // using arraylists as the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int k : input) {
            buckets[hash(k)].add(k);
        }

        for (List<Integer> bucket: buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }


}
