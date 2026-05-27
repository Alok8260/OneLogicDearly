package com.java.ArrayProgram;

public class SmallestElementInArray {
    public void smallestElement(){
        int[] a={9, 0, 5, 7, 8, -1};
        int maxValue=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < maxValue){
                maxValue=a[i];
            }
        }
        System.out.println("Smallest element of Array is: "+ maxValue);
    }

    public static void main(String[] args) {
        SmallestElementInArray sem=new SmallestElementInArray();
        sem.smallestElement();
    }
}
