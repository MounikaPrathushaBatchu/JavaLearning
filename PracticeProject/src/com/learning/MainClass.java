package com.learning;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		// InstraF2 i = () -> System.out.println("hello..."); here InstraF2 has 2 abstract methods so we can't use Lambda Expression for that interface.
		
		IntraF1 i = () -> System.out.println("hello...");
		i.add();
		
//		Predicate Example starts
		String[] ss = {"abc", "amnopqrst", "aqwerty", "bsd", "zxcvbnm"};
		Predicate<String> p = s -> s.length() > 5;
		Predicate<String> p1 = s -> s.startsWith("a");
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<String> al2 = new ArrayList<>();
		ArrayList<String> al3 = new ArrayList<>();
		for(String s : ss) {
			if(p.test(s)) {
				al.add(s);
			}
			if(p.and(p1).test(s)) {
				al1.add(s);
			}
			if(p.or(p1).test(s)) {
				al2.add(s);
			}
			if(p.negate().test(s)) {
				al3.add(s);
			}
		}
		
		System.out.println("al : "+al);
		System.out.println("al1 : "+al1);
		System.out.println("al2 : "+al2);
		System.out.println("al3 : "+al3);
//		Predicate Example ends
		
	}

}
