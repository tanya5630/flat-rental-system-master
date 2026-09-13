package com.flatrental.booking.exception;

public class PropertyUnavailableException extends RuntimeException {
    public PropertyUnavailableException(String message) {
        super(message);
    }
}

