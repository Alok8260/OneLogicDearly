package com.java.ArrayProgram;

// Program to find the second-largest element in an array
public class SecondLargestElement {

    // Method to find and display the second-largest element
    public static void main() {

        // Declare and initialize the array
        int[] arr1 = {3, 4, 5, 7, 6, 9};

        // Sort the array in ascending order
        for (int i = 0; i < arr1.length; i++) {

            // Compare the current element with the remaining elements
            for (int j = i + 1; j < arr1.length; j++) {

                // If the current element is greater than the next element,
                // swap them
                if (arr1[i] > arr1[j]) {

                    // Store arr1[i] temporarily
                    int temp = arr1[i];

                    // Move smaller element to arr1[i]
                    arr1[i] = arr1[j];

                    // Put stored value into arr1[j]
                    arr1[j] = temp;
                }
            }
        }

        // After sorting:
        // Last element = largest number
        // Second last element = second-largest number
        int largestNum = arr1[arr1.length - 2];

        // Display the second-largest element
        System.out.println("The second Largest Number is " + largestNum);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the method to find the second-largest element
        main();
    }
}