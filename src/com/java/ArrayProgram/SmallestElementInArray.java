package com.java.ArrayProgram;

// Program to find the smallest element in an array
public class SmallestElementInArray {

    // Non-static method to find and display the smallest element
    public void smallestElement() {

        // Declare and initialize the array
        int[] a = {9, 0, 5, 7, 8, -1};

        // Initialize with the largest possible integer value
        // so that any element in the array will be smaller than it
        int maxValue = Integer.MAX_VALUE;

        // Traverse the array element by element
        for (int i = 0; i < a.length; i++) {

            // Check if the current element is smaller than the current minimum value
            if (a[i] < maxValue) {

                // Update the minimum value
                maxValue = a[i];
            }
        }

        // Display the smallest element found in the array
        System.out.println("Smallest element of Array is: " + maxValue);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create an object of the class because smallestElement()
        // is a non-static method
        SmallestElementInArray sem = new SmallestElementInArray();

        // Call the method
        sem.smallestElement();
    }
}