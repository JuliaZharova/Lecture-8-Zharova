package com.company;

import com.company.Exceptions.InfiniteException;
import com.company.Exceptions.InvalidNumberException;
import com.company.Exceptions.NonNumberException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Divider.divDouble();
        }
        catch (InfiniteException | IOException exception){
            System.out.println(exception + " : " + exception.getMessage());
        }

        try {
            IntNum.validateNumber();
        } catch (InvalidNumberException | NonNumberException exception){
            System.out.println(exception);
        }
    }
}