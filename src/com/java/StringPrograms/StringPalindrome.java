package com.java.StringPrograms;

import java.util.Scanner;

public class StringPalindrome {
    public static void checkPalindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        String revName="";
        for (int i = name.length()-1; i >=0; i--) {
            revName=revName+name.charAt(i);
        }
        if (name.equalsIgnoreCase(revName)){
            System.out.println(name + " is a palindrome String");
        }else {
            System.out.println(name+" is not a palindrome string");
        }
    }
    public static void main(String[] args) {
        checkPalindrome();
    }
}
