package com.learning.java8Features;

import java.util.function.BiConsumer;

public class LambdaDemo {
	
	public static void main(String []args) {
		
		// calling method using usual manner
		LambdaDemo ld = new LambdaDemo();
		ld.add(10, 20);
		
		// using lambda Expression
		BiConsumer<Integer, Integer> bc = (a,b) -> System.out.println("a+b : "+(a+b));
		bc.accept(30, 40);
		
	}
	
	// method
	public void add(int a, int b) {
		System.out.println(a+b);
	}

}
