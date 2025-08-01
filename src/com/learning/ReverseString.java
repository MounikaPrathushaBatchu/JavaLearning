package com.learning;

public class ReverseString {
    public static void main(String[] args) {
        // Input string (hardcoded)
        String input = "HelloWorld";

        // Convert to character array
        char[] chars = input.toCharArray();

        // Reverse characters manually
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Print reversed string
        System.out.print("Reversed String: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
    }
}


//import java.util.Scanner;
//
//public class ReverseString {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input from user
//        System.out.print("Enter a string: ");
//        String input = sc.nextLine();
//
//        // Convert string to character array
//        char[] chars = input.toCharArray();
//        System.out.println("chars : "+chars);
//
//        // Reverse the character array manually
//        int left = 0;
//        int right = chars.length - 1;
//
//        while (left < right) {
//            // Swap characters
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        // Print reversed string
//        System.out.print("Reversed string: ");
//        for (char c : chars) {
//            System.out.print(c);
//        }
//
//        sc.close();
//    }
//}
