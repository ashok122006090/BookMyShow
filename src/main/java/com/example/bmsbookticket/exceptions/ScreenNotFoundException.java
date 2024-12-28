package com.example.bmsbookticket.exceptions;




public class ScreenNotFoundException extends RuntimeException {

    // Default constructor
    public ScreenNotFoundException() {
        super("Screen not found");
    }

    // Constructor with a custom message
    public ScreenNotFoundException(String message) {
        super(message);
    }

    // Constructor with a custom message and a cause
    public ScreenNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

