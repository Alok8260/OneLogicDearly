package com.java.ArrayProgram;
//This logic is not recommend. Because this test cases might fail in duplicate element
public class SecondSmallestInAnotherWay {
    public static void main(String[] args) {
        int arr[]={4, 6,7 ,8,9 ,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
        System.out.println(arr[1]);
    }
}
