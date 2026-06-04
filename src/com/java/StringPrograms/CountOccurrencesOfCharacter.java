package com.java.StringPrograms;

import java.util.Scanner;

public class CountOccurrencesOfCharacter {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string/name
        System.out.print("Enter any name: ");

        // Read complete line entered by the user
        String name = sc.nextLine();

        // Ask user to enter the character to search
        System.out.print("Enter any char that you want to search: ");

        // Read the search character as String
        // (User should ideally enter only one character)
        String searchChar = sc.nextLine();

        // Variable to store total occurrence count
        int countOccerance = 0;

        // Loop through every character of the string
        for (int i = 0; i < name.length(); i++) {

            // Convert current character into String
            // and compare it with searchChar
            // equalsIgnoreCase() ignores uppercase/lowercase differences
            if (String.valueOf(name.charAt(i)).equalsIgnoreCase(searchChar)) {

                // Increase count if character matches
                countOccerance++;
            }
        }

        // Print total occurrences found
        System.out.println(
                countOccerance + " " + searchChar +
                        " are present in " + name
        );

        // Close Scanner object
        sc.close();
    }
}