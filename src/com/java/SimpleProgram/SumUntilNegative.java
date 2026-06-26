package com.java.SimpleProgram;

import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        while(scanner.hasNextInt()){
            int num=scanner.nextInt();
            if(num >= 0){
                sum+=num;
                System.out.println("Sum of entered Number: " +sum);
            }else{
               sum=-1;
               break;
            }
        }
        System.out.println("You exit the Game: "+ sum);
    }
}
