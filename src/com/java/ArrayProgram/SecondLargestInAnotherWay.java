package com.java.ArrayProgram;

public class SecondLargestInAnotherWay {
    public SecondLargestInAnotherWay(){
        int[] arr={10, 2, 5, 3, 4,5,5,3};
        int largestNum=Integer.MIN_VALUE;
        int secondLargestNum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum){
                secondLargestNum=largestNum;
                largestNum=arr[i];
            } else if (arr[i] > secondLargestNum && arr[i] != largestNum) {
                secondLargestNum=arr[i];
            }
        }
        System.out.print("Second Largest num is: "+ secondLargestNum);
    }

    public static void main(String[] args) {
        SecondLargestInAnotherWay secondLargestInAnotherWay=new SecondLargestInAnotherWay();
    }
}
