package com.java.ArrayProgram;

// Program to count positive and negative numbers in an array
public class FindPositiveNegativeNumber {

    // Method to count positive and negative numbers
    public static void positiveNegativeNum() {

        // Declare and initialize the array
        int[] arr = {3, 5, 6, 2, 4, 8, -1, -5, -8, -7, -10};

        // Variable to store the count of positive numbers
        int positiveNum = 0;

        // Variable to store the count of negative numbers
        int negativeNum = 0;

        // Traverse the array element by element
        for (int i = 0; i <= arr.length - 1; i++) {

            // Check if the current element is greater than or equal to 0
            if (arr[i] >= 0) {

                // Increment positive count
                positiveNum++;
            } else {

                // Increment negative count
                negativeNum++;
            }
        }

        // Display the total count of positive numbers
        System.out.println("The Count of the positive number is " + positiveNum);

        // Display the total count of negative numbers
        System.out.println("The Count of the negative number is " + negativeNum);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to count positive and negative numbers
        positiveNegativeNum();
    }
}