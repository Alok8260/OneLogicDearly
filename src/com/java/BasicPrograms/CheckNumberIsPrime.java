package com.java.BasicPrograms;

import java.util.Scanner;

public class CheckNumberIsPrime {

    // Method to check whether a number is prime or not
    public static void checkPrime(int a) {

        // Numbers less than or equal to 1 are not prime
        if (a <= 1) {
            System.out.println(a + " is not a prime number");
            return;
        }

        // Assume the number is prime initially
        boolean isPrime = true;

        // Check divisibility from 2 to a-1
        for (int i = 2; i < a; i++) {

            // If divisible by any number, it is not prime
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter any number: ");

        // Read the input number
        int a = sc.nextInt();

        // Call method to check prime
        checkPrime(a);

        // Close Scanner to prevent resource leak
        sc.close();
    }
}