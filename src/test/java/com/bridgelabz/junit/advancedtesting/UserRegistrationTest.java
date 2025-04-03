package com.bridgelabz.junit.advancedtesting;

import com.bridgelabz.junit.advanced.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("Naman Malhotra", "naman@gamil.com","Password#123"));
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Naman Malhotra", "naman@gamil.com", "Password#123"));
        assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Naman Malhotra", "naman@gamil.com",  "Password#123"));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    public void testInvalidPasswordTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Naman Malhotra", "naman@gamil.com", "Short1#"));
        assertEquals("Password must be at least 8 characters long and contain a special character (#, $, %, ^, &)",
                exception.getMessage());
    }

    @Test
    public void testInvalidPasswordNoSpecialChar() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> userRegistration.registerUser("Naman Malhotra", "naman@gamil.com", "Short1#"));
        assertEquals("Password must be at least 8 characters long and contain a special character (#, $, %, ^, &)",
                exception.getMessage());
    }
}
