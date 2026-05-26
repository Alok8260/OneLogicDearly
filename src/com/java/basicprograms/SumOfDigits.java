package com.java.basicprograms;

import java.util.Scanner;

public class SumOfDigits {
    public void sumOfDigits(int a){
        int temp=0;
        while (a!=0){
            temp+=a%10;
            a=a/10;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num= sc.nextInt();
        SumOfDigits sd=new SumOfDigits();
        sd.sumOfDigits(num);
    }
}
