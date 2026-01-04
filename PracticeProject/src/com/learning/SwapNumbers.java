package com.learning;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		System.out.println("enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("before swap : "+a+", "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swap : "+a+", "+b);

	}

}
