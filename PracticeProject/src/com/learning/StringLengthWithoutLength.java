package com.learning;

public class StringLengthWithoutLength {

    public static void main(String[] args) {
        String input = "Hello World!";
        int length = getStringLength(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Length of string: " + length);
    }

    public static int getStringLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count); // Try to access each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("exception in StringLengthWithoutLength - "+e);
        }

        return count;
    }
}
