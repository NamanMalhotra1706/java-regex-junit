package com.bridgelabz.junit.advanced;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    public String formatDate(String inputDate) {

        if (inputDate == null || inputDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Input date cannot be null or empty");
        }

        try {
            // Convert input string to LocalDate
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected format: yyyy-MM-dd");
        }
    }

    public static void main(String[] args) {

    }
}
