package com.java.basicprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNum(int num){
        int reversenum=0;
        while(num != 0){
            int temp=num%10;
            reversenum=reversenum * 10 + temp;
            num=num/10;
        }
        System.out.println("The Reverse Number is: "+ reversenum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int a=sc.nextInt();
        reverseNum(a);
    }
}
