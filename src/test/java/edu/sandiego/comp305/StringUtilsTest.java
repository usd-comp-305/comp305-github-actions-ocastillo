package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void reverseStringReversesWord() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void reverseStringHandlesEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void reverseStringHandlesSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    void reverseStringHandlesTheSentence() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }

    @Test
    void reverseStringReturnsNullForNull() {
        assertNull(StringUtils.reverseString(null));
    }
}
