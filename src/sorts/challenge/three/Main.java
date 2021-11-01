package sorts.challenge.three;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] stringsArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        /// tip: to get position of char in the alphabet subtract 97 from that char.
        /// example ---> System.out.println('z' - 97);   would give us 26

        getWidth(stringsArray, 26, 4);
        System.out.println(Arrays.toString(stringsArray));
    }

    public static void getWidth(String[] array, int radix, int width) {
        for (int i = width; i >= 0; i--) {
            radixSort(array, radix, i);
        }
    }

    public static void radixSort(String[] array, int radix, int width) {
        int[] countArray = new int[radix];

        for (String s : array) {
            System.out.println(s.charAt(width));
            countArray[s.charAt(width) - 97]++;
        }
        System.out.println("count array after filling: " + Arrays.toString(countArray));

        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        System.out.println("count array after adjusting: " + Arrays.toString(countArray));

        int numItems = array.length;
        String[] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[array[tempIndex].charAt(width) - 97]] = array[tempIndex];
        }

        System.arraycopy(temp, 0, array, 0, numItems);
    }

}
