package com.java.ArrayProgram;

public class SecondLargestElement {
    public static void main(){
        int[] arr1={3, 4, 5, 7, 6, 9};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length ; j++) {
                if (arr1[i] > arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        int largestNum=arr1[arr1.length-2];
        System.out.println("The second Largest Number is "+ largestNum);
    }

    public static void main(String[] args) {

        main();
    }
}
