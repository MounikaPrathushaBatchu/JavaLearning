package com.learning;

public class CaseConverter {

	public static void main(String[] args) {
		String input = "Case Converter Example";
		String upper = toUppercase(input);
		String lower = toLowerCase(input);
		
		System.out.println("Given String : "+input);
		System.out.println("Upper case : "+upper);
		System.out.println("Lower case : "+lower);

	}
	
	public static String toUppercase(String str) {
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				result += (char) (ch-32);
			} else {
				result += ch;
			}
		}
		return result;
	}
	
	public static String toLowerCase(String str) {
		String result = "";
		
		for(int i = 0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
				result += (char) (ch+32);
			} else {
				result += ch;
			}
		}
		return result;
	}

}
