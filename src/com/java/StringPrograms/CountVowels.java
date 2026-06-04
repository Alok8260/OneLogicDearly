package com.java.StringPrograms;

public class CountVowels {
    public static void main(String[] args) {
        String[] vowel={"A", "E", "I", "O", "U"};
        String name="sun";
        int vowelCount=0;
        for (int i = 0; i <= vowel.length-1; i++) {
            for (int j = 0; j < name.length(); j++) {
                if (vowel[i].equalsIgnoreCase(String.valueOf(name.charAt(j)))){
                    vowelCount++;
                }
            }
        }
        System.out.println(vowelCount);
    }
}
