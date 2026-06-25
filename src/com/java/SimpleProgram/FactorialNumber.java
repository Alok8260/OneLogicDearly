package com.java.SimpleProgram;

import java.util.Scanner;

public class FactorialNumber {
    public void factorialNumber(int num){
        int factorialNum=1;
        for (int i = 1; i <= num; i++) {
            factorialNum=i*factorialNum;
        }
        System.out.println("Factorial number of "+num+" is "+factorialNum);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number=scanner.nextInt();
        FactorialNumber fnum=new FactorialNumber();
        fnum.factorialNumber(number);
    }
}
