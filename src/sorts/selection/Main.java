package sort.selection;import java.util.Arrays;public class Main {    //static int greaterIndex = 0;    public static void main(String[] args) {        int[] myArray = {20, 7, -15, 7, -22, 35, 55};        sortArray(myArray);        System.out.println(Arrays.toString(myArray));    }    static void sortArray(int [] array) {        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {            int greaterIndex = getGreaterIndex(array, lastUnsortedIndex);            swap(array, lastUnsortedIndex, greaterIndex);        }    }    static int getGreaterIndex(int[] array, int lastUnsortedIndex) {        int greaterIndex = 0;        for (int index = 0; index <= lastUnsortedIndex; index++) {            if (array[greaterIndex] < array[index]) {                greaterIndex = index;            }        }        return greaterIndex;    }    static void swap(int[] array, int switchA, int switchB) {        if (switchA == switchB) {            return;        }        int temp = array[switchA];        array[switchA] = array[switchB];        array[switchB] = temp;    }    static void printMyArray(int[] array) {        for (int j : array) {            System.out.println(j);        }    }}