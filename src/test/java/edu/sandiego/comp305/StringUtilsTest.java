package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testReverseStringEvenLength() {
        assertEquals("tset", StringUtils.reverseString("test"));
    }

    @Test
    void testReverseStringOddLength() {
        assertEquals("123", StringUtils.reverseString("321"));
    }
}