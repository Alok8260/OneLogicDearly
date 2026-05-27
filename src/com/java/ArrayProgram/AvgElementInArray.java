package com.java.ArrayProgram;

public class AvgElementInArray {
    public static void avgElement(){
        int[] arr={3, 7, 8, 9, 5,1, 2};
        int countArrayElement=0;
        int totalArrayElement=0;
        for (int i = 0; i <=arr.length-1; i++) {
            totalArrayElement+=arr[i];
            countArrayElement++;
        }
        int avgElement= totalArrayElement/countArrayElement;
        System.out.println("The average of the element is "+ avgElement);
    }
    public static void main(String[] args) {
        avgElement();
    }
}
