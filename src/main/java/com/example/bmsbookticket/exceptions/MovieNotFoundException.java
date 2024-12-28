package com.example.bmsbookticket.exceptions;

public class MovieNotFoundException extends RuntimeException {

    // Default constructor
    public MovieNotFoundException() {
        super("Movie not found");
    }

    // Constructor with a custom message
    public MovieNotFoundException(String message) {
        super(message);
    }

    // Constructor with a custom message and cause
    public MovieNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
