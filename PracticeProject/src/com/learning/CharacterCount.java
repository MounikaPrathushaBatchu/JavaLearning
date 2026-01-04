package com.learning;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
    public static void main(String[] args) {
        String input = "Java Programming";

        // Convert to lowerCase to count characters case-insensitively
        input = input.toLowerCase();

        // Remove white spaces if you don't want to count them
        input = input.replaceAll("\\s+", "");

        // Create a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character
        for (char ch : input.toCharArray()) {
        	// If the character is already in the map, increase the count
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print the character counts
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    
}
