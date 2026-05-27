package com.java.ArrayProgram;

import java.util.Scanner;

public class SearchElementInArray {
    public static void searchElement(int searchElement){
        int[] arr={1, 4, 6, 7, 9, 0, -1, -4 ,4, 18};
        boolean isPresent=true;
        for (int i = 0; i <=arr.length-1; i++) {
            if (arr[i] == searchElement){
                isPresent=true;
            }else {
                isPresent=false;
            }
        }
        if (isPresent){
            System.out.println(searchElement +" is present in an Array");
        }else {
            System.out.println(searchElement+ " is not present in an Array");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Search number: ");
        int num= sc.nextInt();
        searchElement(num);
    }
}
