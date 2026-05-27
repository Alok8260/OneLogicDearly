package com.java.ArrayProgram;

public class CountEvenAndOddNumber {
    public static void countEvenOdd(){
        int[] arr={4, 5, 6, 8, 9, 0, 1, 34, 5, 7, 99};
        int odd=0;
        int even=0;
        for (int i = 0; i <=arr.length-1; i++) {
            if (arr[i]%2==0){
                even++;
            }else if (arr[i]%2!=0){
                odd++;
            }
        }
        System.out.println("The odd number count is "+ odd);
        System.out.println("The even number count is "+ even);
    }
    public static void main(String[] args) {
        countEvenOdd();
    }
}
