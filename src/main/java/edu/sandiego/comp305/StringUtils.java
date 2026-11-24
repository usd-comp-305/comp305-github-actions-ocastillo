package edu.sandiego.comp305;

public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Reverses the given string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public static String reverseString(final String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
}
