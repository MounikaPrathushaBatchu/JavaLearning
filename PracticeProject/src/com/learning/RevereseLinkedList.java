package com.learning;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class RevereseLinkedList {

	public static void main(String[] args) {

		LinkedList<String> testSteps = new LinkedList<>(Arrays.asList("Login", "Navigation", "Logout"));
		LinkedList<String> reverse = new LinkedList<>();

		ListIterator<String> itr = testSteps.listIterator(testSteps.size());

		while (itr.hasPrevious()) {

			reverse.add(itr.previous());

		}
		System.out.println("Orginal List :" + testSteps);
		System.out.println("Reveresed list " + reverse);
	}

}
