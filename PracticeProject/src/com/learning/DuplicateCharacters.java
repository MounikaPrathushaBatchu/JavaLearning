package com.learning;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";
        findDuplicates(input);
    }

    public static void findDuplicates(String str) {
        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();
        
        int[] count = new int[256]; // ASCII size

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            System.out.println("count["+i+"] : "+count[str.charAt(i)]+", "+str.charAt(i));
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char)i + " : " + count[i] + " times");
            }
        }
    }
}
