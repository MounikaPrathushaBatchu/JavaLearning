package com.learning;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"apple", "ape", "apricot"};
        String prefix = findLongestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + prefix);
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        int index = 0;

        while (true) {
            if (index >= strs[0].length()) break;

            char currentChar = strs[0].charAt(index);

            // Compare currentChar with the character at same position in all other strings
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != currentChar) {
                    return buildPrefix(strs[0], index); // return up to the last matched character
                }
            }

            index++; // move to next character
        }

        return buildPrefix(strs[0], index); // full match of the first string
    }

    // Avoid using substring; instead build manually up to index
    public static String buildPrefix(String str, int endIndex) {
        char[] chars = new char[endIndex];
        for (int i = 0; i < endIndex; i++) {
            chars[i] = str.charAt(i);
        }
        return new String(chars);
    }
}