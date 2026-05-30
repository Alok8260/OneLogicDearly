package com.java.ArrayProgram;

// Program to count the number of even and odd elements in an array
public class CountEvenAndOddNumber {

    // Method to count even and odd numbers
    public static void countEvenOdd() {

        // Declare and initialize the array
        int[] arr = {4, 5, 6, 8, 9, 0, 1, 34, 5, 7, 99};

        // Variable to store the count of odd numbers
        int odd = 0;

        // Variable to store the count of even numbers
        int even = 0;

        // Traverse the array element by element
        for (int i = 0; i <= arr.length - 1; i++) {

            // Check if the current element is divisible by 2
            // If remainder is 0, the number is even
            if (arr[i] % 2 == 0) {

                // Increment even count
                even++;
            }

            // If remainder is not 0, the number is odd
            else if (arr[i] % 2 != 0) {

                // Increment odd count
                odd++;
            }
        }

        // Display the total count of odd numbers
        System.out.println("The odd number count is " + odd);

        // Display the total count of even numbers
        System.out.println("The even number count is " + even);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to count even and odd numbers
        countEvenOdd();
    }
}