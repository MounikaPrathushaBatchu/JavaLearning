package com.learning;

public class PrimeNumbersRange {
	
	public static void main(String[] args) {
		int range = 100;
		System.out.println("Prime Numbers upto "+range+" are :");
		for(int num = 2; num<= range; num++) {
			boolean isPrime = true;
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(num+" ");
		}
	}
}
