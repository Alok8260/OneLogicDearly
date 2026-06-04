package com.java.StringPrograms;

import java.util.Scanner;

public class CountOccurrencesOfCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any name: ");
        String name=sc.nextLine();
        System.out.print("Enter any char that you want to search: ");
        String searchChar=sc.nextLine();
        int countOccerance=0;
        for (int i = 0; i < name.length(); i++) {
            if (String.valueOf(name.charAt(i)).equalsIgnoreCase(searchChar)){
                countOccerance++;
            }
        }
        System.out.println(countOccerance +" "+ searchChar +" are present in " +name);
    }
}
