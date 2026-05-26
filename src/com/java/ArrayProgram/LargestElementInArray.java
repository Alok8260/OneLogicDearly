package com.java.ArrayProgram;

public class LargestElementInArray {
    public static void largestElement(){
        int[] a={2, 4,5,6, 10 ,7,9};
        int b=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b){
                b=a[i];
            }
        }
        System.out.println("The largest element is: "+b);
    }
    public static void main(String[] args) {
        largestElement();
    }
}
