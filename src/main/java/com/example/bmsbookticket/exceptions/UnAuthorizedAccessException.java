package com.example.bmsbookticket.exceptions;


public class UnAuthorizedAccessException extends RuntimeException {

    // Default constructor
    public UnAuthorizedAccessException() {
        super("Unauthorized access");
    }

    // Constructor with a custom message
    public UnAuthorizedAccessException(String message) {
        super(message);
    }

    // Constructor with a custom message and a cause
    public UnAuthorizedAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
