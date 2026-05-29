package com.java.ArrayProgram;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1={3, 5, 6, 7, 8};
        int[] arr2={4, 9, 10, 11};
        int[] mergedArray=new int[arr1.length + arr2.length];

        for(int i=0; i <arr1.length; i++){
            mergedArray[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length+i]=arr2[i];
        }
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]+ " ");
        }

    }
}
