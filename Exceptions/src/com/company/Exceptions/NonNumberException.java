package com.company.Exceptions;

public class NonNumberException extends Exception {
    private String notNumber;

    public NonNumberException(String message, String notNumber) {
        super(message);
        this.notNumber = notNumber;
    }

    @Override
    public String toString() {
        return "NonNumberException was thrown. Not number string was: '" + notNumber + "'";
    }
}
