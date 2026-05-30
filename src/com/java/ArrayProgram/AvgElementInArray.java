package com.java.ArrayProgram;

// Program to find the average of all elements present in an array
public class AvgElementInArray {

    // Method to calculate and display the average
    public static void avgElement() {

        // Declare and initialize the array
        int[] arr = {3, 7, 8, 9, 5, 1, 2};

        // Variable to count the number of elements in the array
        int countArrayElement = 0;

        // Variable to store the sum of all array elements
        int totalArrayElement = 0;

        // Loop through each element of the array
        for (int i = 0; i <= arr.length - 1; i++) {

            // Add the current element to the total sum
            totalArrayElement += arr[i];

            // Increment the count of elements
            countArrayElement++;
        }

        // Calculate the average
        // Integer division is performed because all variables are int
        int avgElement = totalArrayElement / countArrayElement;

        // Display the calculated average
        System.out.println("The average of the element is " + avgElement);
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Call the method to calculate the average
        avgElement();
    }
}