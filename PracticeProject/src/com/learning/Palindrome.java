package com.learning;

public class Palindrome {

	public static void main(String[] args) {
		String input = "Abcddcba";
		boolean palindrome = isPalindrom(input);
		System.out.println("given String :"+input);
		
		if(palindrome){
			System.out.println(input+" is palindrome");
		} else{
			System.out.println(input+" is not palindrome");
		}

	}
	
	public static boolean isPalindrom(String str) {
		
		int start = 0;
		int end = str.length() - 1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		
		return true;
		
		/*String result = "";
		boolean palindrome = false;
		for(int i = str.length() - 1; i >= 0; i--){
			result += str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(result)){
			palindrome = true;
		}
		
		return palindrome;*/
	}

}
