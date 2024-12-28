package com.example.bmsbookticket.exceptions;


public class FeatureNotSupportedByScreen extends RuntimeException {

    // Default constructor
    public FeatureNotSupportedByScreen() {
        super("The requested feature is not supported by the screen.");
    }

    // Constructor with a custom message
    public FeatureNotSupportedByScreen(String message) {
        super(message);
    }

    // Constructor with a custom message and cause
    public FeatureNotSupportedByScreen(String message, Throwable cause) {
        super(message, cause);
    }
}
