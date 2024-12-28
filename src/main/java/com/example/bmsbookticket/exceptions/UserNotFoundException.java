package com.example.bmsbookticket.exceptions;


// Custom exception for User not found
public class UserNotFoundException extends RuntimeException {

    // Default constructor
    public UserNotFoundException() {
        super("User not found");
    }

    // Constructor with custom message
    public UserNotFoundException(String message) {
        super(message);
    }

    // Constructor with message and cause
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
