package com.learning;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.learning.java8Features.Employee;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

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
		
		System.out.println("Bi-Predicate");
		BiPredicate<Integer, Integer> bp = (a,b) -> (a+b) % 2 == 0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(15, 20));
//		Predicate Example ends
		
//		Function Example starts
		Function<String, Integer> f1 = s -> s.length();
		Function<String, String> f2 = s -> s.toUpperCase();
		for(String s : ss) {
			System.out.println("length : "+f1.apply(s));
			System.out.println("UpperCase : "+f2.apply(s));
		}
		
		System.out.println("Bi-Function");
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> bf  = (experience, name) -> new Employee(experience, name);
		
		employeeList.add(bf.apply(10, "ABC"));
		employeeList.add(bf.apply(15, "Qwerty"));
		employeeList.add(bf.apply(20, "ASDF"));
		employeeList.add(bf.apply(1, "MNB"));
		employeeList.add(bf.apply(6, "POIUY"));
		
		for(Employee emp : employeeList) {
			System.out.println("experience : "+emp.experience);
			System.out.println("name : "+emp.name);
			System.out.println();
		}
		
//		Function Example ends
		
//		Consumer Example Starts
		Consumer<String> c = s -> System.out.println(s);
		c.accept("udgtguh");
		c.accept("1234");
		
		System.out.println("Bi-Consumer");
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		populate(empList);
		BiConsumer<Employee, Integer> bc = (e, d) -> e.salary = e.salary + d;
		
		for(Employee emp :empList) {
			bc.accept(emp, 500);
		}
		for(Employee emp :empList) {
			System.out.println("name : "+emp.name);
			System.out.println("salary : "+emp.salary);
			System.out.println();
		}
		
//		Consumer Example ends
		
//		Supplier Example starts
		
		Supplier<String> s = () -> {
			String otp = "";
			for(int j = 0; j <= 5; j++) {
				otp = otp + (int)(Math.random() * 10);
			}
			return otp;
		};
		
		System.out.println("OTP : "+s.get());
		
	}
	
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("A", 1000));
		l.add(new Employee("B", 2000));
		l.add(new Employee("C", 3000));
		l.add(new Employee("D", 4000));
	}

}
