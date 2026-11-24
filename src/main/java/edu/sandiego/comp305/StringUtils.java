package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {

    }

    public static String reverseString(final String string) {
        String newString = "";
        for (char ch : string.toCharArray()) {
            newString = ch + newString;
        }
        return newString;
    }
}
