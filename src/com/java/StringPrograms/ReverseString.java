package com.java.StringPrograms;

import java.util.Scanner;

public class ReverseString {

    /*
     * Custom main method without arguments
     * This method contains logic to reverse a string
     */
    public static void main() {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter Your Name: ");

        // Read complete line input from user
        String name = sc.nextLine();

        // Variable declared to store reversed string
        // (Currently not used in this program)
        String reverse = " ";

        /*
         * Loop starts from the last index of string
         * name.length() - 1 gives last character index
         *
         * Example:
         * String = "JAVA"
         * Indexes = 0 1 2 3
         *
         * Loop will run:
         * 3 -> 2 -> 1 -> 0
         */
        for (int i = name.length() - 1; i >= 0; i--) {

            /*
             * charAt(i) extracts character at current index
             * Characters are printed one by one in reverse order
             */
            System.out.print(name.charAt(i));
        }

        // Close scanner to prevent resource leak
        sc.close();
    }

    /*
     * Actual JVM main method
     * Program execution starts from here
     */
    public static void main(String[] args) {

        // Calling custom main() method
        main();
    }
}