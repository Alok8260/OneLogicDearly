package com.java.ArrayProgram;

// Program to find the sum of all elements in an array
public class SumOfElementInArray {

    // Method to calculate and display the sum of array elements
    public static void sumOfElement() {

        // Declare and initialize the array
        int[] arr = {4, 5, 3, 9, 2, 1};

        // Variable to store the sum of all elements
        // Initially set to 0
        int sum = 0;

        // Traverse the array from the first element to the last element
        for (int i = 0; i <= arr.length - 1; i++) {

            // Add the current element to the sum
            sum += arr[i];

            // Equivalent to:
            // sum = sum + arr[i];
        }

        // Display the final sum
        System.out.println(sum);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to calculate the sum
        sumOfElement();
    }
}