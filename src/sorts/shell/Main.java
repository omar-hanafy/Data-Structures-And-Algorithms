
package sort.shell;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {100, 15, -15, 7, 55, 1, -22, 4, -50};
        shellSortArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void shellSortArray(int[] array) {
        int gap = array.length / 2;
        int firstUnsortedIndex;

        do {
            for (firstUnsortedIndex = gap; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
                shellEngine(array, firstUnsortedIndex, gap);
            }
            gap = gap / 2;
        }
        while (gap >= 1);
    }

    static void shellEngine(int[] array, int firstUnsortedIndex, int gap) {
        int tempLowValue = array[firstUnsortedIndex];
        int lowValueIndex;

        for (lowValueIndex = firstUnsortedIndex; lowValueIndex >= gap && tempLowValue < array[lowValueIndex - gap]; lowValueIndex -= gap) {
            array[lowValueIndex] = array[lowValueIndex - gap];
        }

        array[lowValueIndex] = tempLowValue;
    }

}

