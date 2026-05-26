package com.java.BasicPrograms;

import java.util.Scanner;

public class FindLargestOfTwoNumber {
    public static void findLargestNumber(int a, int b){
        if (a >b){
            System.out.println(a + " Bigger than "+ b);
        } else if (a == b) {
            System.out.println(a + " and " +b+" is Same");
        }else {
            System.out.println(b + " is bigger than "+ a);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a= sc.nextInt();
        System.out.print("Enter your second number: ");
        int b=sc.nextInt();
        findLargestNumber(a, b);
    }
}
