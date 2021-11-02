package stacks.challenge;

import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        String cleanString = string.replaceAll("[^A-Za-z]+", "").toLowerCase(Locale.ROOT);

        LinkedList<Character> linkedStack = new LinkedList<>();

        for (int i = 0; i < cleanString.length(); i++) {
            linkedStack.push(cleanString.charAt(i));
        }

        for (int i = 0; i < cleanString.length(); i++) {
            if (linkedStack.get(i) != cleanString.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
