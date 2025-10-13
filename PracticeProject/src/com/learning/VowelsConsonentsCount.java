package com.learning;

public class VowelsConsonentsCount {

	public static void main(String[] args) {
		
		String input = "Commit and Push";
		countVowelsConsonents(input);

	}
	
	public static void countVowelsConsonents(String str) {
		str = str.toLowerCase();
		
		int vowelsCount = 0;
		int consonentsCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
					vowelsCount++;
				} else {
					consonentsCount++;
				}
			}
		}
		
		System.out.println("Given String : "+str);
		System.out.println("Vowels count : "+vowelsCount);
		System.out.println("Consonents count : "+consonentsCount);
	}

}
