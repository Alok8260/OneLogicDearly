package com.java.ArrayProgram;

public class SumOfElementInArray {
    public static void sumOfElement(){
        int[] arr={4, 5, 3, 9, 2, 1};
        int sum=0;
        for (int i = 0; i <=arr.length-1; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfElement();
    }
}
