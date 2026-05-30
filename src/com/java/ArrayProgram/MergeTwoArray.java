package com.java.ArrayProgram;

// Program to merge two arrays into a single array
public class MergeTwoArray {

    public static void main(String[] args) {

        // First array
        int[] arr1 = {3, 5, 6, 7, 8};

        // Second array
        int[] arr2 = {4, 9, 10, 11};

        // Create a new array whose size is the sum of both arrays' lengths
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Copy all elements of arr1 into mergedArray
        for (int i = 0; i < arr1.length; i++) {

            // Store each element of arr1 in mergedArray
            // starting from index 0
            mergedArray[i] = arr1[i];
        }

        // Copy all elements of arr2 into mergedArray
        for (int i = 0; i < arr2.length; i++) {

            // Start inserting arr2 elements after the last index of arr1
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Display all elements of the merged array
        for (int i = 0; i < mergedArray.length; i++) {

            // Print each element followed by a space
            System.out.print(mergedArray[i] + " ");
        }
    }
}