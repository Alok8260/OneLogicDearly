package com.java.ArrayProgram;

public class FindPositiveNegativeNumber {
    public static void positiveNegativeNum(){
        int[] arr={3, 5, 6, 2, 4, 8, -1, -5, -8, -7, -10};
        int positiveNum=0;
        int negativeNum=0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] >= 0){
                positiveNum++;
            }else {
                negativeNum++;
            }
        }
        System.out.println("The Count of the positive number is "+positiveNum);
        System.out.println("The Count of the negative number is "+negativeNum);
    }
    public static void main(String[] args) {
        positiveNegativeNum();
    }
}
