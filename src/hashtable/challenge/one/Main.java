package hashtable.challenge.one;

import java.util.Arrays;

public class Main {
    private static final int[] nums = new int[10];

    public static void main(String[] args) {

        int[] numsToAdd = {59382, 43, 6894};

        for (int j : numsToAdd) {
            add(j);
        }

        System.out.println(Arrays.toString(nums));


    }

    public static void add(int value) {
        int hashed = hash(value);
        if (exist(hashed)) {
            int stopIndex = hashed;
            if (hashed == nums.length - 1) {
                hashed = 0;
            } else {
                hashed++;
            }

            while (exist(hashed) && hashed != stopIndex) {
                hashed = (hashed + 1) % nums.length;
            }
        }
        if (exist(hashed)) {
            System.out.println("sorry :)");
        } else {
            nums[hashed] = value;

        }
    }

    public static boolean exist(int index) {
        return nums[index] != 0;
    }

    public static int hash(int value) {
        int digit = 0;
        int number = Math.abs(value);
        int length = 0;
        while (number > 0) {
            digit = number % 10;
            length++;
            number = number / 10;
        }
        System.out.println("length of the int = " + length);
        System.out.println("first digit = " + digit);
        System.out.println("last digit = " + Math.abs(value % 10));

        return digit;
    }
}
