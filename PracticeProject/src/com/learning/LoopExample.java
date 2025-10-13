package com.learning;

public class LoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            if (i == 3) {
                continue; // skips printing 3
            }

            if (i == 6) {
                break; // stops loop when i is 6
            }

            if (i == 9) {
                return; // exits the whole main method (won't happen in this case)
            }

            System.out.println(i);
        }
    }
}
