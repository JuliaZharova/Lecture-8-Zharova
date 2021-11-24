package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Divider.divDouble();
        }
        catch (Exception exception){
            System.out.println(exception + " : " + exception.getMessage());
        }

        try {
            IntNum.validateNumber();
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}