package com.company.Exceptions;

public class InfiniteException extends Exception {
    public InfiniteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InfiniteException was thrown";
    }
}