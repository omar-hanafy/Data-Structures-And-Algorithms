package sort.radix;import java.util.Arrays;class Main {    public static void main(String[] args) {        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};        radixSort(radixArray, 10, 4);        System.out.println("radix array after sorting: " + Arrays.toString(radixArray));    }    public static void radixSort(int[] input, int radix, int width) {        //بلف على عدد ال width بتاع الايتم الواحد وفي كل مرة بعمل سورت        //مثال 1330 يبقى هلف 4 مرات        for (int position = 0; position < width; position++) {            radixSingleSort(input, position, radix);        }    }    public static void radixSingleSort(int[] input, int position, int radix) {        int[] countArray = new int[radix];        //fill count array        for (int value : input) {            countArray[getDigit(position, value, radix)]++;        }        System.out.println("count array after filling: " + Arrays.toString(countArray));        // Adjust the count array        for (int j = 1; j < radix; j++) {            countArray[j] += countArray[j - 1];        }        System.out.println("count array after adjusting: " + Arrays.toString(countArray));        int numItems = input.length;        int[] temp = new int[numItems];        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =                    input[tempIndex];        }        System.arraycopy(temp, 0, input, 0, numItems);    }    public static int getDigit(int position, int value, int radix) {        return value / (int) Math.pow(radix, position) % radix;    }}