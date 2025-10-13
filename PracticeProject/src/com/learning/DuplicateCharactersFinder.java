package com.learning;

import java.util.*;

public class DuplicateCharactersFinder {

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'a', 'd', 'b', 'e', 'f', 'a'};

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            System.out.println("ch : "+ch+", charCountMap : "+charCountMap);
        }

        System.out.println("Duplicate characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
