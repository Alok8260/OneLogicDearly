package com.java.SimpleProgram;

import java.util.Scanner;

//Q1-Write a program which takes the values of length and breadth from user and check if it is a square or not.
public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth of an area: ");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of an area: ");
        int breadth= sc.nextInt();
        if (length==breadth){
            System.out.println("It is a Square");
        } else{
            System.out.println("It is a Rectangle");
        }
    }
}
