package com.company.Exceptions;

public class InvalidNumberException extends Exception {
    private int invalidNumber;

    public InvalidNumberException(String message, int invalidNumber) {
        super(message);
        this.invalidNumber = invalidNumber;
    }

    @Override
    public String toString() {
        return "InvalidNumberException was thrown. Invalid number was: " + invalidNumber;
    }
}
