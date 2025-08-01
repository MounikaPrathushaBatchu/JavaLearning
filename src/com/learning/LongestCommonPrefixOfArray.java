package com.learning;

public class LongestCommonPrefixOfArray {

    public static void main(String[] args) {
        String[] words = {"ape", "apple", "apricot","apoket"};
        String prefix = findLongestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + prefix);
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String result = "";

        // Get the length of the shortest string
        int minLen = strs[0].length();
        System.out.println("minLen : "+minLen);
        for (int i = 1; i < strs.length; i++) {
            int len = strs[i].length();
            System.out.println("len : "+len+", "+(len < minLen));
            if (len < minLen)
                minLen = len;
        }

        // Compare characters one by one
        for (int i = 0; i < minLen; i++) {
        	System.out.println("strs[0] : "+strs[0]);
        	char currentChar = strs[0].charAt(i);
            System.out.println("1. currentChar : "+currentChar);
            boolean allMatch = true;
            for (int j = 1; j < strs.length; j++) {
                System.out.println("strs.length : "+strs.length);
            	System.out.println("strs["+j+"].charAt("+i+") : "+strs[j].charAt(i));
            	if (strs[j].charAt(i) != currentChar) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                System.out.println("2. currentChar : "+currentChar);
            	result += currentChar; // build prefix manually
                System.out.println("result : "+result);
            } else {
                break; // stop at first mismatch
            }
        }

        return result;
    }
}