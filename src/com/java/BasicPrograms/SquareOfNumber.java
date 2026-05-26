package com.java.BasicPrograms;

import java.util.Scanner;

public class SquareOfNumber {
    public static void squareOfNumber(int num){
        int squareNumber=num*num;
        System.out.println("Square Number of "+num+ " is " +squareNumber);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Number:- ");
        int number= sc.nextInt();
        squareOfNumber(number);
    }
}
