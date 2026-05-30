package com.java.ArrayProgram;

// Program to find the largest element in an array
public class LargestElementInArray {

    // Method to find and display the largest element
    public static void largestElement() {

        // Declare and initialize the array
        int[] a = {2, 4, 5, 6, 10, 7, 9};

        // Initialize variable with the smallest possible integer value
        // so that any element in the array will be greater than it
        int b = Integer.MIN_VALUE;

        // Traverse the array element by element
        for (int i = 0; i < a.length; i++) {

            // Check if the current element is greater than the current largest value
            if (a[i] > b) {

                // Update the largest value
                b = a[i];
            }
        }

        // Display the largest element found in the array
        System.out.println("The largest element is: " + b);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to find the largest element
        largestElement();
    }
}