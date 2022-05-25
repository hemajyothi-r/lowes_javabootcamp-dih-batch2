package com.labs.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		//Hashset unordered entries-----takes null
//		HashSet<String> countries = new HashSet<>();
//		
//		countries.add("India");
//		countries.add("USA");
//		countries.add("Australia");
//		countries.add("Europe");
//		countries.add("India");
//		countries.add(null);
//		countries.add("USA");
//		countries.add(null);
//		System.out.println("Hashset elements");
//		for(String item: countries) {
//			System.out.println(item);
//		}
		
		

		//Hashset unordered entries-----takes null
		LinkedHashSet<String> countries = new LinkedHashSet<>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("Europe");
		countries.add("India");
		countries.add(null);
		countries.add("USA");
		countries.add(null);
		System.out.println("Hashset elements");
		for(String item: countries) {
			System.out.println(item);
		}
		
		
		//Treeset ordered entries---doesnt allow null as it does auto sorting
		TreeSet<String> countries1 = new TreeSet<>();
		
		countries1.add("\nIndia");
		countries1.add("USA");
		//countries1.add(null);
		countries1.add("Australia");
		countries1.add("Europe");
		countries1.add("India");
		//countries1.add(null);
		countries1.add("USA");
		
		System.out.println("Treeset elements");
		for(String item: countries1) {
			System.out.println(item);
		}		
		
	}

}
