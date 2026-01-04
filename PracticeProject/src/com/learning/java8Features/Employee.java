package com.learning.java8Features;

public class Employee {
	
	public String name;
	public int experience;
	public int salary;
	
	public Employee(String name, int experience, int salary) {
		this.name = name;
		this.experience = experience;
		this.salary = salary;
	}
	
	public Employee(int experience, String name) {
		this.experience = experience;
		this.name = name;
	}
	
	public Employee(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}

}
