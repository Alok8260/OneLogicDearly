package com.java.BasicPrograms;

import java.util.Scanner;

public class SquareOfNumber {

    // Method to calculate and display the square of a number
    public static void squareOfNumber(int num) {

        // Calculate square by multiplying the number by itself
        int squareNumber = num * num;

        // Display the result
        System.out.println("Square Number of " + num + " is " + squareNumber);
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter any Number: ");

        // Read the number from the user
        int number = sc.nextInt();

        // Call the method to calculate and print the square
        squareOfNumber(number);

        // Close Scanner to prevent resource leak
        sc.close();
    }
}