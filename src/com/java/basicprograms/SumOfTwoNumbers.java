package com.java.basicprograms;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public void sumOfTw0(int a, int b){
        int c= a+b;
        System.out.println("Sum of "+a +" & "+ b + " is " +c);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= scanner.nextInt();
        System.out.print("Enter second number: ");
        int b=scanner.nextInt();
        SumOfTwoNumbers sm=new SumOfTwoNumbers();
        sm.sumOfTw0(a,b);
    }
}
