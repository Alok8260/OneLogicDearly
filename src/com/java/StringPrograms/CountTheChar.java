package com.java.StringPrograms;

public class CountTheChar {
    public static void main(String[] args) {
        String name="Alok";
        int count=0;
        for (int i = 0; i < name.length() ; i++) {
            //System.out.println(name.charAt(i));
            count++;
        }
        System.out.println(count);
    }
}
