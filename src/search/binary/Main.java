package search.binary;

import java.time.chrono.MinguoDate;

public class Main {

    public static void main(String[] args) {
        int[] array = {-22, -15, 1, 7, 20, 35, 55};

        System.out.println("value found using iterative binary search is: " +
                iterativeBinarySearch(array, 4, 0, array.length));
        System.out.println("value found using recursive binary search is: "
                + recBinarySearch(array, 4, 0, array.length));
    }

    public static int iterativeBinarySearch(int[] array, int value, int start, int end) {
        while (start < end) {
            int midPoint = (start + end) / 2;
            if (array[midPoint] == value) {
                return midPoint;
            } else if (array[midPoint] < value) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }
        return -1;
    }

    private static int recBinarySearch(int[] array, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int midPoint = (start + end) / 2;
        if (array[midPoint] == value) {
            return midPoint;
        } else if (value < array[midPoint]) {
            return recBinarySearch(array, value, start, midPoint);
        } else {
            return recBinarySearch(array, value, midPoint + 1, end);
        }
    }
}
