package com.java.basicprograms;

import java.util.Scanner;

public class OddEvenNumber {
    public static void oddEven(int a){
        if(a%2==0){
            System.out.println(a + " is even number");
        }else{
            System.out.println(a+" is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int positiveNumber= sc.nextInt();
        oddEven(positiveNumber);
    }
}
