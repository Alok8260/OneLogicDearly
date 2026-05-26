package com.java.BasicPrograms;

import java.util.Scanner;

public class CheckNumberIsPrime {
    public static void checkPrime(int a){
            if(a <= 1) {
                System.out.println(a + " not a prime number");
                return;
            }
            boolean isPrime=true;
            for (int i=2; i<a; i++){
                if (a % i == 0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(a + " is a prime number");
            }else{
                System.out.println(a + " is not a prime number");
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        checkPrime(a);
    }
}
