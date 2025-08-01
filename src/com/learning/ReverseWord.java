package com.learning;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "Mounika Pratyusha";
        String reversed = reverse(word);
        System.out.println("Original Word: " + word);
        System.out.println("Reversed Word: " + reversed);
    }

    public static String reverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        return result;
    }
}
