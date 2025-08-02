package com.learning;

public class StringReverse {

	public static void main(String[] args) {
		String inputVal = "Qwerty Keyboard";
		String reverseStr = reverse(inputVal);
		System.out.println("Given String :"+inputVal);
		System.out.println("Reverse String :"+reverseStr);

	}
	
	public static String reverse(String str) {
		String resultStr = "";
		
		for(int i = str.length() - 1; i >= 0; i--){
			resultStr += str.charAt(i);
		}
		return resultStr;
	}

}
