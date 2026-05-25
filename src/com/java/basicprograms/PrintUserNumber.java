package com.java.basicprograms;

import java.util.Scanner;

public class PrintUserNumber {
    public static void takeUserInput(int userInput){
        System.out.println("You Entered "+ userInput);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumber=sc.nextInt();
       takeUserInput(userNumber);
    }
}
