package sorts.challenge.one;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 15, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        System.out.println("i is: " + end + " " + Arrays.toString(input));

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {
//        System.out.println(start + " " + mid + " " + end + " ");
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        //    [20, 15, -33, 55, 7, 1, -22]

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            if (input[i] <= input[j]) {
                temp[tempIndex] = input[i];
                tempIndex++;
                i++;
            } else {
                temp[tempIndex] = input[j];
                tempIndex++;
                j++;
            }

        }
        System.out.println("tempIndex" + Arrays.toString(temp));
        System.out.println("b" + Arrays.toString(input));
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.out.println("a" + Arrays.toString(input));

        System.arraycopy(temp, 0, input, start, tempIndex);
        System.out.println("a2" + Arrays.toString(input));


    }
}
