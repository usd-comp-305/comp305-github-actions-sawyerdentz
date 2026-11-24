package edu.sandiego.comp305;

public class StringUtils {
    public static String reverseString(String string) {
        int i = 1;
        while (i < 2) {

        }
        String newString = "";
        for (char ch : string.toCharArray()) {
            newString = ch + newString;
        }
        return newString;
    }
}
