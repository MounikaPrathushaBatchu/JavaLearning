package com.learning;

import java.util.*;

public class DuplicateIntegerFinder {

    public static void main(String[] args) {
        char[] input = {1,2,3,1,4,2,3,3,4,5,6,7,8,9};

        Map<Integer, Integer> intCountMap = new HashMap<>();

        for (int i : input) {
        	intCountMap.put(i, intCountMap.getOrDefault(i, 0) + 1);
            System.out.println("i : "+i+", intCountMap : "+intCountMap);
        }

        System.out.println("Duplicate characters and their counts:");
        for (Map.Entry<Integer, Integer> entry : intCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
