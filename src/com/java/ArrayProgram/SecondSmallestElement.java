package com.java.ArrayProgram;
//This logic works with normal cases.
public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 6, 9};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Second Smallest Number: " + secondSmallest);
    }
}
