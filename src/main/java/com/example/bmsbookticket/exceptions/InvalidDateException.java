package com.example.bmsbookticket.exceptions;


public class InvalidDateException extends RuntimeException {

    // Default constructor
    public InvalidDateException() {
        super("Invalid date provided");
    }

    // Constructor with a custom message
    public InvalidDateException(String message) {
        super(message);
    }

    // Constructor with a custom message and cause
    public InvalidDateException(String message, Throwable cause) {
        super(message, cause);
    }
}
