package com.company;

import com.company.Exceptions.InfiniteException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {

    public static void divDouble() throws InfiniteException, IOException {
        Double val1 = 0.0;
        Double val2 = 0.0;
        Double result;
        Scanner scanner = new Scanner(System.in);
        boolean isNextDouble = false;

        do {
            System.out.println("First task. Please enter the value of the first variable: ");
            try {
                isNextDouble = scanner.hasNextDouble();
                if (isNextDouble) {
                    val1 = scanner.nextDouble();
                } else {
                    scanner.next();
                }
            } catch (InputMismatchException exception) {
                scanner = new Scanner(System.in);
                System.out.println("Please enter a valid number.");
            }
        } while (!isNextDouble);

        isNextDouble = false;

        do {
            System.out.println("First task. Please enter the value of the second variable: ");
            try {
                isNextDouble = scanner.hasNextDouble();
                if (isNextDouble) {
                    val2 = scanner.nextDouble();
                } else {
                    scanner.next();
                }
            } catch (InputMismatchException exception) {
                scanner = new Scanner(System.in);
                System.out.println("Please enter a valid number.");
            }
        } while (!isNextDouble);

        try {
            result = val1 / val2;
            if (result.isInfinite()) throw new InfiniteException(val1 + "/" + val2 + " = infinite");
            System.out.println(result);
        } catch (InfiniteException e) {
            System.out.println("InfiniteException was thrown." + val1 + "/" + val2 + " = infinite");
        }
    }
}
