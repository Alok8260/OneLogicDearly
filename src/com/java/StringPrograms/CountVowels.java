package com.java.StringPrograms;

public class CountVowels {
    public static void main(String[] args) {

        // Array containing all vowels
        String[] vowel = {"A", "E", "I", "O", "U"};

        // Input string
        String name = "Alok";

        // Variable to store total vowel count
        int vowelCount = 0;

        // Print length of the string
        System.out.println(name.length());

        // Loop through each vowel in the vowel array
        for (int i = 0; i < vowel.length - 1; i++) {

            // Loop through each character of the string
            for (int j = 0; j < name.length(); j++) {

                // Compare current vowel with current character
                // equalsIgnoreCase() ignores uppercase/lowercase differences
                if (vowel[i].equalsIgnoreCase(String.valueOf(name.charAt(j)))) {

                    // Increase vowel count if matched
                    vowelCount++;
                }
            }
        }

        // Print total number of vowels found
        System.out.println(vowelCount);
    }
}