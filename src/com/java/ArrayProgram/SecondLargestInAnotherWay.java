package com.java.ArrayProgram;

// Program to find the second-largest distinct element in an array
public class SecondLargestInAnotherWay {

    // Constructor
    public SecondLargestInAnotherWay() {

        // Declare and initialize the array
        int[] arr = {10, 2, 5, 3, 4, 5, 5, 3};

        // Store the largest number found so far
        // Initialize with the smallest possible integer value
        int largestNum = Integer.MIN_VALUE;

        // Store the second-largest number found so far
        // Initialize with the smallest possible integer value
        int secondLargestNum = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than the largest number
            if (arr[i] > largestNum) {

                // Current largest becomes second largest
                secondLargestNum = largestNum;

                // Update largest number
                largestNum = arr[i];
            }

            // Check if current element:
            // 1. Is greater than second largest
            // 2. Is not equal to the largest element
            else if (arr[i] > secondLargestNum && arr[i] != largestNum) {

                // Update second-largest number
                secondLargestNum = arr[i];
            }
        }

        // Display the second-largest number
        System.out.print("Second Largest num is: " + secondLargestNum);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create an object to invoke the constructor
        SecondLargestInAnotherWay secondLargestInAnotherWay =
                new SecondLargestInAnotherWay();
    }
}