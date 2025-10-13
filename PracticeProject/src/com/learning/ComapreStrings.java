package com.learning;

public class ComapreStrings {

	public static void main(String[] args) {
		String input1 = "Vineeth";
		String input2 = "Gnani";
		
		if(areEqualString(input1, input2)){
			System.out.println(input1+" and "+input2+" are same strings");
		} else {
			System.out.println(input1+" and "+input2+" are not same strings");
		}

	}
	
	public static boolean areEqualString(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		
		return true;
	}

}
