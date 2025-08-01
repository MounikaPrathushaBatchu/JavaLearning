package com.learning;

public class SentenceWordReverser {

    public static String reverseEachWord(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
                System.out.println("reversed : "+reversed);
            }
            result += reversed + " ";
        }

        return result.trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        String input = "Manikanta Sai";
        String output = reverseEachWord(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);  // atnakinaM iaS
    }
}