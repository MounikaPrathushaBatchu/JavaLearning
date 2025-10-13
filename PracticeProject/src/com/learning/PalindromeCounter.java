package com.learning;

public class PalindromeCounter {

    public static void main(String[] args) {
        String s = "mmadamm";
        int count = countPalindromicSubstrings(s);
        System.out.println("Total palindromic substrings: " + count);
    }

    // Method to count palindromes
    public static int countPalindromicSubstrings(String s) {
        int totalCount = 0;
        int n = s.length();
        System.out.println("n : "+n);

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.println("start : "+start+", end : "+end+", s : "+s);
            	if (isPalindrome(s, start, end)) {
                    int length = end - start + 1;
                    if (length >= 2) { // Only count substrings of length 2 or more
                        totalCount++;
                        System.out.println("totalCount : "+totalCount);
                        // Print the palindrome
                        for (int i = start; i <= end; i++) {
                            System.out.print(s.charAt(i));
                        }
                        System.out.println();
                    }
                }
            }
        }

        return totalCount;
    }

    // Method to check if a substring s[from..to] is a palindrome
    public static boolean isPalindrome(String s, int st, int en) {
    	while (st < en) {
            if (s.charAt(st) != s.charAt(en)) {
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
}