package com.java.SimpleProgram;

import java.util.Scanner;

public class PrintPositiveNumber {
    public void positiveNumber(int number){
        if (number < 0){
            System.out.println("The number is negative and skipped");
        }else {
            System.out.println("You Enter "+ number);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int positiveNumber=scanner.nextInt();
        PrintPositiveNumber ppn=new PrintPositiveNumber();
        ppn.positiveNumber(positiveNumber);
    }
}
