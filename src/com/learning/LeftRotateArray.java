package com.learning;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of rotations

        int n = arr.length;
        d = d % n; // To handle d > n
        System.out.println("d : "+d);

        int[] rotated = new int[n];

        // Shift elements
        for (int i = 0; i < n; i++) {
        	
        	/* r[0] = arr[2] --(0+2)%5
        	 * r[1] = arr[3] --(1+2)%5
        	 * r[2] = arr[4] --(2+2)%5
        	 * r[3] = arr[0] --(3+2)%5
        	 * r[4] = arr[1] --(4+2)%5
        	 * 	*/
        	System.out.println("rotated["+i+"] : "+rotated[i]+", arr[("+i+" + "+d+") % "+n+"] : "+arr[(i + d) % n]);
            rotated[i] = arr[(i + d) % n];
        }

        // Print rotated array
        System.out.print("Left Rotated Array: ");
        for (int val : rotated) {
            System.out.print(val + " ");
        }
    }
}
