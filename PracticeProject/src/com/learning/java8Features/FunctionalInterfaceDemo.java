package com.learning.java8Features;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	void singleAbstractMethod();
	
//	void singleAbstractMethod2();
	
	default void show1() {
		System.out.println("Show 1");
	}
	
	default void show2() {
		System.out.println("Show 2");
	}
	
	static void display1() {
		System.out.println("Display 1");
	}
	
	static void display2() {
		System.out.println("Display 2");
	}
	
	static void display3() {
		System.out.println("Display 3");
	}

}
