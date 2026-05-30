package com.java.ArrayProgram;

// Program to print the elements of an array in reverse order
public class ReverseArray {

    // Method to display the array in reverse order
    public static void reverseArray() {

        // Declare and initialize the array
        int[] arr = {4, 6, 8, 2, 3};

        // Start from the last index of the array
        // and move towards the first index
        for (int i = arr.length - 1; i >= 0; i--) {

            // Print the current element followed by a space
            System.out.print(arr[i] + " ");
        }
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to print the array in reverse order
        reverseArray();
    }
}