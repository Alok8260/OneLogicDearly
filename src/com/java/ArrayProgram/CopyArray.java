package com.java.ArrayProgram;

// Program to copy elements from one array to another array
public class CopyArray {

    public static void main(String[] args) {

        // Source array containing original elements
        int[] arr1 = {3, 5, 6, 7, 9, 8};

        // Create a new array with the same size as arr1
        // This array will store the copied elements
        int[] arr2 = new int[arr1.length];

        // Loop through each element of arr1
        for (int i = 0; i < arr1.length; i++) {

            // Copy the current element from arr1 to arr2
            arr2[i] = arr1[i];
        }

        // Loop through arr2 to display the copied elements
        for (int i = 0; i < arr2.length; i++) {

            // Print each element followed by a comma
            System.out.print(arr2[i] + ", ");
        }
    }
}