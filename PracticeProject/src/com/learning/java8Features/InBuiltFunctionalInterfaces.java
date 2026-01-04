package com.learning.java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InBuiltFunctionalInterfaces {

	public static void main(String[] args) {
		
		Function<Employee, String> f = e -> {
			int experience = e.experience;
			String position = "";
			
			if(experience >= 20) position = "Manager";
			else if(experience >= 15) position = "Project Manager";
			else if(experience >= 10) position = "Team Lead";
			else if(experience >= 5) position = "Senior Software Engineer";
			else if(experience >= 3) position = "Associate Software Engineer";
			else position = "Fresher";
			return position;
		};
		
		Predicate<Employee> p = e -> e.salary >= 10000;
		Consumer<Employee> c = e -> {
			System.out.println("name : "+e.name);
			System.out.println("salary : "+e.salary);
			System.out.println("experience : "+e.experience);
			System.out.println("Position : "+f.apply(e));
			System.out.println();
		};
		
		Employee[] e = {
			new Employee("abc",12,12000),
			new Employee("xyz",25,1500000),
			new Employee("mno",6,120000),
			new Employee("pqr",2,12000),
			new Employee("pqr",9,1200000)
		};
		for(Employee e1 :e) {
			if(p.test(e1))
				c.accept(e1);
		}

	}

}
