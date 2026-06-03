package com.java.StringPrograms;

import java.util.Scanner;

public class StringPalindrome {

    // Method to check whether a string is palindrome or not
    public static void checkPalindrome() {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter Your Name: ");

        // Read complete line input from user
        String name = sc.nextLine();

        // Variable to store reversed string
        String revName = "";

        /*
         * Loop starts from last character of string
         * and moves toward first character
         */
        for (int i = name.length() - 1; i >= 0; i--) {

            /*
             * charAt(i) extracts one character at index i
             * Then character is added into revName
             */
            revName = revName + name.charAt(i);
        }

        /*
         * equalsIgnoreCase() compares two strings
         * ignoring uppercase and lowercase differences
         */
        if (name.equalsIgnoreCase(revName)) {

            // If original string and reversed string are same
            System.out.println(name + " is a palindrome String");

        } else {

            // If strings are different
            System.out.println(name + " is not a palindrome string");
        }

        // Close scanner to prevent resource leak
        sc.close();
    }

    // Main method - program execution starts from here
    public static void main(String[] args) {

        // Calling palindrome checking method
        checkPalindrome();
    }
}