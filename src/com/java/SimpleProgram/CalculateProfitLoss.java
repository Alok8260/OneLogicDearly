package com.java.SimpleProgram;

import java.util.Scanner;

public class CalculateProfitLoss {
    public void profit(int costPrice, int sellingPrice){
        int profit=sellingPrice-costPrice;
        int loss=costPrice-sellingPrice;
        if (sellingPrice < costPrice){
            System.out.println("Loss= " + loss);
        } else if (sellingPrice == costPrice){
            System.out.println("No Profit no Loss");
        }else {
            System.out.println("Profit= " + profit);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int costPrice=scanner.nextInt();
        System.out.print("Enter Selling Price: ");
        int sellingPrice=scanner.nextInt();
        CalculateProfitLoss cl=new CalculateProfitLoss();
        cl.profit(costPrice, sellingPrice);
    }
}
