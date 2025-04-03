package com.bridgelabz.junit.advanced;

public class UserRegistration {

    public void registerUser(String username, String email, String password){
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password == null || password.length() < 8 || !password.matches(".*[#$%^&].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain a special character (#, $, %, ^, &)");
        }

        // Registration successful
        System.out.println("User registered successfully!");
    }
    public static void main(String[] args) {

    }
}
