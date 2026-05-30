package com.java.ArrayProgram;

// This program finds the smallest and second-smallest elements in an array.
// It works correctly when the array contains at least two distinct numbers.
public class SecondSmallestElement {

    public static void main(String[] args) {

        // Input array
        int[] arr = {3, 4, 5, 7, 6, 9};

        // Initialize smallest with the maximum possible integer value.
        // Any number in the array will be smaller than this initially.
        int smallest = Integer.MAX_VALUE;

        // Initialize secondSmallest with the maximum possible integer value.
        // This will be updated during traversal.
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array element by element
        for (int i = 0; i < arr.length; i++) {

            // Check if the current element is smaller than the current smallest
            if (arr[i] < smallest) {

                // The old smallest becomes the second smallest
                secondSmallest = smallest;

                // Update smallest with the current element
                smallest = arr[i];
            }

            // Check if the current element is:
            // 1. Smaller than the current second smallest
            // 2. Not equal to the smallest element
            else if (arr[i] < secondSmallest && arr[i] != smallest) {

                // Update second smallest
                secondSmallest = arr[i];
            }
        }

        // Display the smallest element found in the array
        System.out.println("Smallest Number: " + smallest);

        // Display the second-smallest element found in the array
        System.out.println("Second Smallest Number: " + secondSmallest);
    }
}