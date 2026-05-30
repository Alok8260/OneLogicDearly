package com.java.ArrayProgram;

// Program to sort an array in descending order
public class DescArray {

    // Method to perform descending order sorting
    public static void main() {

        // Declare and initialize the array
        int[] arr = {1, 4, 8, 0, 8, 6};

        // Outer loop selects each element one by one
        for (int i = 0; i < arr.length; i++) {

            // Inner loop compares the current element with remaining elements
            for (int j = i + 1; j < arr.length; j++) {

                // If the current element is smaller than the next element
                // swap them to move the larger element toward the beginning
                if (arr[i] < arr[j]) {

                    // Store arr[i] temporarily
                    int temp = arr[i];

                    // Assign larger value to arr[i]
                    arr[i] = arr[j];

                    // Put the stored value into arr[j]
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Call the sorting method
        main();
    }
}