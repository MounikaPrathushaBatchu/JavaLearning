package com.learning.java8Features;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		// Method reference
		FunctionalInterfaceDemo fi1 = Test :: testImplementtaion;
		fi1.singleAbstractMethod();
		
		// Lambda Expression
		FunctionalInterfaceDemo  fi2 = () -> System.out.println("Mounika is good girl");
		fi2.singleAbstractMethod();

	}

}

class Test{
	
	public static void testImplementtaion() {
		System.out.println("Manikanta is bad boy");
	}
	
}
