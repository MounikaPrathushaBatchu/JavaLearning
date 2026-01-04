package com.learning;

public class Factorial {

	public static void main(String[] args) {
		
		// Iterative manner
		int num = 6;
		long iFactorial = 1;
		for(int i = 1; i <= num; i++) {
			iFactorial = iFactorial * i;
		}
		System.out.println("Factorial of "+num+" is : "+iFactorial);
		
		// Recursive Manner
		long rFactorial = recursiveFactorial(num);
		
		System.out.println("Factorial of "+num+" is : "+rFactorial);
	}
	
	public static long recursiveFactorial(int number) {
		if(number == 0 || number == 1) {
			return 1;
		}
		
		long rFactorial = number * recursiveFactorial(number - 1);
		
		return rFactorial;
	}

}
