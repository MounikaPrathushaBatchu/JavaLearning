package com.learning;

public class EvenOddPositionSum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, -30, 40, 50, -60, 70, 20};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) { // Even index
            	evenSum += numbers[i];
            } else {
            	oddSum += numbers[i];
            }
        }

        System.out.println("Sum of elements at even positions: " + evenSum);
        System.out.println("Sum of elements at odd positions: " + oddSum);
    }
}
