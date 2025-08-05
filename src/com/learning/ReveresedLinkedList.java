package com.learning;

import java.util.Collections;
import java.util.LinkedList;

public class ReveresedLinkedList {

	public static void main(String[] args) {

		LinkedList<String> testSteps = new LinkedList<>();
		testSteps.add("Login");
		testSteps.add("Navigation");
		testSteps.add("Validate");
		testSteps.add("Logout");

		System.out.println("Orginal List :" + testSteps);

		Collections.reverse(testSteps);
		System.out.println("Reveresed List :" + testSteps);

	}

}
