package com.bridgelabz.junit.advancedtesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.bridgelabz.junit.advanced.DateFormatter;

public class DateFormatterTest {

    DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void testValidDateConversion() {
        assertEquals("15-03-2025", dateFormatter.formatDate("2025-03-15"));
    }

    @Test
    public void testAnotherValidDate() {
        assertEquals("01-01-2000", dateFormatter.formatDate("2000-01-01"));
    }

    @Test
    public void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate("15/03/2025"));
        assertEquals("Invalid date format. Expected format: yyyy-MM-dd", exception.getMessage());
    }

    @Test
    public void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate(null));
        assertEquals("Input date cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testEmptyStringInput() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> dateFormatter.formatDate(""));
        assertEquals("Input date cannot be null or empty", exception.getMessage());
    }
}
