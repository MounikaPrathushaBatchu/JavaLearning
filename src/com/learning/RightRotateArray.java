package com.learning;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of right rotations

        int n = arr.length;
        d = d % n; // In case d > n

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + d) % n] = arr[i];
        }

        // Print rotated array
        System.out.print("Right Rotated Array: ");
        for (int val : rotated) {
            System.out.print(val + " ");
        }
    }
}
