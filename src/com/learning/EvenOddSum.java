package com.learning;

public class EvenOddSum {
    public static void main(String[] args) {
        int[] numbers = {3, -2, 4, -7, 6, 1, -5, -8, 4}; // Sample input array

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}
