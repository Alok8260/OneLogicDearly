package com.java.BasicPrograms;

import java.util.Scanner;

public class SwapWithoutTemporaryVariable {

    // Method to swap two numbers without using a temporary variable
    public void swapTwoNumber(int a, int b) {

        // Display values before swapping
        System.out.println("Before swap: " + a);
        System.out.println("Before swap: " + b);

        // Swap logic using arithmetic operations
        a = a + b; // Sum of a and b
        b = a - b; // Original value of a
        a = a - b; // Original value of b

        // Display values after swapping
        System.out.println("After swap: " + a);
        System.out.println("After swap: " + b);
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read first number
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();

        // Read second number
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        // Create object of the class
        SwapWithoutTemporaryVariable swap = new SwapWithoutTemporaryVariable();

        // Call method to swap numbers
        swap.swapTwoNumber(firstNum, secondNum);

        // Close Scanner to prevent resource leak
        sc.close();
    }
}