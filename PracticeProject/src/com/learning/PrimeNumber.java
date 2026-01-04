package com.learning;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num = 25;
		int count = 0;
		boolean isPrime = true;
		
		// iterates upto given number
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
		
		// Iterates upto sqrt(num)
		if(num <= 1) {
			isPrime = false;
		} else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
	}

}
