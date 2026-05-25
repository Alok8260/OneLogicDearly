package com.java.basicprograms;

import java.util.Scanner;

public class FindLargestOfThreeNumber {
    public static void enterThreeNumber(int a, int b, int c){
        if(a > b & a > c){
            System.out.println(a +" is bigger than "+ b +" and "+c);
        } else if (b > a & b> c) {
            System.out.println(b +" is bigger than "+ a +" and "+c);
        } else if (c > a & c > b) {
            System.out.println(c +" is bigger than "+ a +" and "+b);
        } else if (a == b & b == c ) {
            System.out.println("All three value are same");
        }else {
            System.out.println("Enter a correct number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= sc.nextInt();

        System.out.print("Enter second number: ");
        int b= sc.nextInt();

        System.out.print("Enter third number: ");
        int c= sc.nextInt();

        enterThreeNumber(a, b, c);
    }
}
