package com.java.ArrayProgram;

import java.util.Scanner;

// Program to search an element in an array
public class SearchElementInArray {

    // Method to search the given element
    public static void searchElement(int searchElement) {

        // Array in which the element will be searched
        int[] arr = {1, 4, 6, 7, 9, 0, -1, -4, 4, 18};

        // Initially assume the element is not present
        boolean isPresent = false;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Check whether the current element matches the search element
            if (arr[i] == searchElement) {

                // Element found
                isPresent = true;

                // No need to continue searching
                break;
            }
        }

        // Display result
        if (isPresent) {
            System.out.println(searchElement + " is present in the Array");
        } else {
            System.out.println(searchElement + " is not present in the Array");
        }
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for the element to search
        System.out.print("Enter Search Number: ");

        // Read integer input
        int num = sc.nextInt();

        // Call search method
        searchElement(num);

        // Close scanner to prevent resource leak
        sc.close();
    }
}