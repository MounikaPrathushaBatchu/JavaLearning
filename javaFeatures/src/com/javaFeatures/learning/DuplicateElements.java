package com.javaFeatures.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,2,1);
		
//		Set<Integer> duplicates = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
//		System.out.println("duplicate elements : "+duplicates);
		
		Stream<Integer> streamelements = list.stream();
		
		System.out.println("duplicate elements : "+streamelements.distinct());

	}

}
