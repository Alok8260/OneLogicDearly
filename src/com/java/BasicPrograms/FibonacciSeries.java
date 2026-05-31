package com.java.BasicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

    // Method to generate and print Fibonacci series
    public static void fibonacciSeries(int num) {

        // First two numbers of Fibonacci series
        int a = 0;
        int b = 1;

        // Display message
        System.out.print("The Fibonacci series of " + num + " terms is: ");

        // Print first two terms
        System.out.print(a + " , ");
        System.out.print(b + " , ");

        // Generate remaining terms
        for (int i = 2; i < num; i++) {

            // Next term is the sum of previous two terms
            int c = a + b;

            // Print the current term
            System.out.print(c + " , ");

            // Update values for next iteration
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of terms
        System.out.print("Enter any Number: ");

        // Read input
        int number = sc.nextInt();

        // Call method to print Fibonacci series
        fibonacciSeries(number);

        // Close Scanner to prevent resource leak
        sc.close();
    }
}