package com.company;
import com.company.Exceptions.InvalidNumberException;
import com.company.Exceptions.NonNumberException;

import java.util.Scanner;

public class IntNum {
    private static int MinValidNumber = 1;
    private static int MaxValidNumber = 100;
    private static Scanner scanner = new Scanner(System.in);
    private static int number;

    static void validateNumber() throws InvalidNumberException, NonNumberException {
        System.out.println("Please enter the integer number in the range [1...100]:");
        String input = null;
        try {
            input = scanner.nextLine();
            number = Integer.parseInt(input);
        } catch (Exception exception) {
            throw new NonNumberException("Only numbers in range [1...100] allowed.", input);
        }

        if(number < MinValidNumber || number > MaxValidNumber){
            throw new InvalidNumberException("Entered number is not in the range [1...100]", number);
        }

        System.out.println("Entered number: " + number);
    }
}
