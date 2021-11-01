package sort.insertion;import java.util.Arrays;public class Main {    public static void main(String[] args) {        int[] myArray = {100, 15, -15, 7, 55, 1, -22, 4, -50};//        recursionInsertSort(myArray, 1);        insertSort(myArray);        System.out.println(Arrays.toString(myArray));    }    static void insertSort(int[] array) {        for (int firstUnsortedIndex = 1; firstUnsortedIndex <= array.length - 1; firstUnsortedIndex++) {            insertEngine(array, firstUnsortedIndex);        }    }    static void insertEngine(int[] array, int firstUnsortedIndex) {        int value = array[firstUnsortedIndex];        int i;        for (i = firstUnsortedIndex; i > 0 && value < array[i - 1]; i--) {            array[i] = array[i - 1];        }        array[i] = value;    }    static void recursionInsertSort(int[] array, int firstUnsortedIndex) {        if (firstUnsortedIndex >= array.length) {            return;        }        int i;        int value = array[firstUnsortedIndex];        for (i = firstUnsortedIndex; i > 0 && value < array[i - 1]; i--) {            array[i] = array[i - 1];        }        array[i] = value;        recursionInsertSort(array, firstUnsortedIndex + 1);    }}