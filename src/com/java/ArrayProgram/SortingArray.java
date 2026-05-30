package com.java.ArrayProgram;

// Program to sort an array in ascending order
public class SortingArray {

    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {9, 8, 7, 6};

        // Outer loop selects each element one by one
        for (int i = 0; i < arr.length; i++) {

            // Inner loop compares the current element
            // with all remaining elements
            for (int j = i + 1; j < arr.length; j++) {

                // If the current element is greater than the next element,
                // swap them to move the smaller element to the left
                if (arr[i] > arr[j]) {

                    // Store arr[i] temporarily
                    int temp = arr[i];

                    // Place the smaller element at position i
                    arr[i] = arr[j];

                    // Place the stored value at position j
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {

            // Display each element followed by a comma
            System.out.print(arr[i] + ", ");
        }
    }
}