package com.company;

import com.company.Exceptions.InfiniteException;

import java.util.Scanner;

public class Divider {

    public static void divDouble() throws InfiniteException {
        Double val1 = 0.0;
        Double val2 = 0.0;
        Double result;
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;

        do {
            System.out.println("Please enter the value of the first variable: ");
            try {
                val1 = scanner.nextDouble();
                cycle = false;
            } catch (Exception exception) {
                scanner = new Scanner(System.in);
                System.out.println("Please enter a valid number.");
            }
        } while (cycle);

        cycle = true;

        do {
            System.out.println("Please enter the value of the second variable: ");
            try {
                val2 = scanner.nextDouble();
                cycle = false;
            } catch (Exception exception) {
                scanner = new Scanner(System.in);
                System.out.println("Please enter a valid number.");
            }
        } while (cycle);

        result = val1/val2;
        if(result.isInfinite()){
            throw new InfiniteException(val1 + "/" + val2 + " = infinite");
        }
    }
}
