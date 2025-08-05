package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersUsingHashMap {
    public static void main(String[] args) {
        String input = "aabbccddeeffgg";

        // Convert to lowercase to handle case-insensitivity
        input = input.toLowerCase();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {  // Optional: Only count letters/digits
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Duplicate characters and their counts:");

        // Iterate and print characters with count > 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}