package com.java.BasicPrograms;

import java.util.Scanner;

public class SwapWithoutTemporaryVariable {
    public void swapTwoNumber(int a, int b){
        System.out.println("Before swap: "+ a);
        System.out.println("Before swap: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: "+a);
        System.out.println("After swap: "+b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum=sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNum=sc.nextInt();
        SwapWithoutTemporaryVariable swap=new SwapWithoutTemporaryVariable();
        swap.swapTwoNumber(firstNum, secondNum);
    }
}
