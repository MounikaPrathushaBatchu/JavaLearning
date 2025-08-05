package com.learning;

public class WordCount {

    public static void main(String[] args) {
        String input = "  Hello, this is a test string!  ";
        int wordCount = countWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If current char is not a space and we're not already in a word
            if (ch != ' ' && !inWord) {
                inWord = true;
                count++;
            } 
            // If current char is a space, we're not in a word anymore
            else if (ch == ' ') {
                inWord = false;
            }
        }

        return count;
    }
}

