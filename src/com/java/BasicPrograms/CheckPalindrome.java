package com.java.BasicPrograms;

import java.util.Scanner;

public class CheckPalindrome {
    public static void enterNumber(int num){
        int originalNum=num;
        int palindromeNumber=0;
        while(num != 0){
            int temp=num %10;
            palindromeNumber=palindromeNumber*10+temp;
            num=num/10;
        }
        System.out.println(palindromeNumber);
        if (originalNum == palindromeNumber){
            System.out.println(originalNum + " is a palindrome number");
        }else {
            System.out.println(originalNum + " is not a palindrome number");

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int enterNum= sc.nextInt();
        enterNumber(enterNum);
    }
}
