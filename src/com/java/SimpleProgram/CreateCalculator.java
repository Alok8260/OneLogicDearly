package com.java.SimpleProgram;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class CreateCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an operator: ");
        String operator=scanner.next();
        System.out.print("Enter first number: ");
        int firstNumber=scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber=scanner.nextInt();
        switch (operator){
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber*secondNumber);
                break;
            case "/":
                System.out.println(firstNumber/secondNumber);
                break;
            default:
                System.out.println("Something enter wrong");
        }
    }
}
