package com.learning;

public class StringReverser {
	
	public static void main(String[] args) {
        String input = "Java";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed); // Output: sediuG avaJ
    }

    public static String reverseString(String originalString) {
        if (originalString == null || originalString == "") {
            return originalString;
        }
        
        char[] chars = originalString.toCharArray();

        // Reverse the array manually
        char[] reversedChars = new char[chars.length];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedChars[j] = chars[i];
            System.out.println("reversedChars["+j+"] : "+reversedChars[j]);
            j++;
        }

        // Build string manually from reversed array
        String reversedString = "";
        for (int i = 0; i < reversedChars.length; i++) {
            reversedString += reversedChars[i]; // manually append characters
            System.out.println(i+" reversedString : "+reversedString);
        }

        return reversedString;
    }

    
}