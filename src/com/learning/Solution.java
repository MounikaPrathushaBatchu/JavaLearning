package com.learning;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static int cardPackets(List<Integer> cardTypes) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each card type
        for (int card : cardTypes) {
            freqMap.put(card, freqMap.getOrDefault(card, 0) + 1);
        }

        int n = cardTypes.size();
        int minExtra = Integer.MAX_VALUE;

        // Try every possible k >= 2
        for (int k = 2; k <= n + 10; k++) {
            int extra = 0;
            for (int freq : freqMap.values()) {
                int rem = freq % k;
                //System.out.println(rem);
                extra += (rem == 0) ? 0 : (k - rem);
            }

            int total = n + extra;

            // Check if packets can be evenly formed
            if (total % k == 0) {
                minExtra = Math.min(minExtra, extra);
            }
        }

        return minExtra;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
            new OutputStreamWriter(System.out));

        int cardTypesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cardTypes = IntStream.range(0, cardTypesCount)
            .mapToObj(i -> {
                try {
                    return bufferedReader.readLine().trim();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = cardPackets(cardTypes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}