package com.java.StringPrograms;

public class CountTheChar {

    public static void main(String[] args) {

        // String variable storing the text
        String name = "Alok";

        // Variable to store character count
        int count = 0;

        /*
         * Loop starts from index 0
         * and runs until the last character
         *
         * name.length() gives total number of characters
         */
        for (int i = 0; i < name.length(); i++) {

            /*
             * charAt(i) extracts character at current index
             * (Currently commented because it is not needed)
             */
            // System.out.println(name.charAt(i));

            /*
             * Increase count by 1 for each character
             */
            count++;
        }

        // Print total number of characters
        System.out.println(count);
    }
}