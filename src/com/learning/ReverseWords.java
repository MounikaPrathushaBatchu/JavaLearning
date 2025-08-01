package com.learning;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "Java Guides";
        String output = reverseWords(input);
        System.out.println("Output: " + output);
    }

    public static String reverseWords(String str) {
        str = str.trim(); // remove leading and trailing spaces
        int length = str.length();
        String result = "";
        String word = "";

        for (int i = 0; i <= length; i++) {
            char ch = (i < length) ? str.charAt(i) : ' ';
            System.out.println("ch : "+ch);

            if (ch != ' ') {
                word += ch;
//                System.out.println("1. word: "+word);
            } else if (!word.equals("")) {
            	System.out.println("2. word: "+word);
            	result = word + " " + result;
            	System.out.println("result : "+result);
                word = "";
            }
        }

        return result.trim();
    }
}