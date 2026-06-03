package com.java.StringPrograms;

import java.util.Scanner;
public class ReverseString {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        String reverse=" ";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        main();
    }
}
