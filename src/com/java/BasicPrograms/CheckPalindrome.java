package com.java.BasicPrograms;

import java.util.Scanner;

public class CheckPalindrome {

    // Method to check whether a number is palindrome or not
    public static void enterNumber(int num) {

        // Store the original number for comparison later
        int originalNum = num;

        // Variable to store the reversed number
        int palindromeNumber = 0;

        // Reverse the given number
        while (num != 0) {

            // Extract the last digit
            int temp = num % 10;

            // Build the reversed number
            palindromeNumber = palindromeNumber * 10 + temp;

            // Remove the last digit from the number
            num = num / 10;
        }

        // Print the reversed number
        System.out.println(palindromeNumber);

        // Compare original number with reversed number
        if (originalNum == palindromeNumber) {
            System.out.println(originalNum + " is a palindrome number");
        } else {
            System.out.println(originalNum + " is not a palindrome number");
        }
    }

    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter any number: ");

        // Read the number from the user
        int enterNum = sc.nextInt();

        // Call the method to check palindrome
        enterNumber(enterNum);

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}