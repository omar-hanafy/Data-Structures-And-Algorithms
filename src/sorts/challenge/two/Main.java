package sorts.challenge.two;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {100, 15, -15, 7, 55, 1, -22, 4, -50};
        recursionInsertSort(myArray, 1);
        System.out.println(Arrays.toString(myArray));
    }

    static void recursionInsertSort(int[] array, int firstUnsortedIndex) {
        if (firstUnsortedIndex >= array.length) {
            return;
        }

        int i;
        int value = array[firstUnsortedIndex];

        for (i = firstUnsortedIndex; i > 0 && value < array[i - 1]; i--) {
            array[i] = array[i - 1];
        }

        array[i] = value;

        recursionInsertSort(array, firstUnsortedIndex + 1);
    }
}

