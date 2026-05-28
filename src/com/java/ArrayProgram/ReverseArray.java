package com.java.ArrayProgram;

public class ReverseArray {
    public static void reverseArray(){
        int[] arr={4, 6, 8, 2,3};
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        reverseArray();
    }
}
