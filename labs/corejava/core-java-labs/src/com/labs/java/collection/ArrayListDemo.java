package com.labs.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nos = new int[3];
		nos[0] = 10;
		nos[1] = 20;
		nos[2] = 30;
		
		for (int i: nos) {
			System.out.println(i);
			
		}
				
		//Collection
		//List
		//ArrayList
		
		ArrayList arrList = new ArrayList();
		//ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		
		for(Object item: arrList) {
			System.out.println(item);
		}
				
		ArrayList<String> arrStrList = new ArrayList<>();
		
		arrStrList.add("Hema");
		arrStrList.add("JYothi");
		arrStrList.add("Sammu");
		
		for(Object item: arrStrList) {
			System.out.println(item);
		}
		
		arrList.set(2, 100);
		System.out.println("Array list after update");
		for(Object item: arrList) {
			System.out.println(item);
		}
		//removing elements
		arrStrList.remove(0);
		System.out.println("Array list after removal");
		for(Object item: arrStrList) {
			System.out.println(item);
		}
		
		
		ArrayList<Integer> arrList1 = new ArrayList<>();
		
		arrList1.add(40);
		arrList1.add(50);
		arrList1.add(60);
		
		for(Integer item: arrList1) {
			System.out.println(item);
		}
					
		//updating 
		arrList1.set(2, 100);
		System.out.println("Array list after update");
		for(Integer item: arrList1) {
			System.out.println(item);
		}	
		
		//Use of Iterator instead of For, For each loops
		System.out.println("Array list using Iterator");
		Iterator iterator = arrList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
			
		//Use of Iterator instead of For, For each loops
		System.out.println("Array list using List Iterator");
		ListIterator listIterator = arrList.listIterator();
		//listIterator.hasPrevious();
					
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		if (listIterator.hasPrevious())
		System.out.println(listIterator.previous());
		
		// polymorphism ex with List n ArrayList
		List<Integer> listArr = new ArrayList<>();
		listArr.add(40);
		listArr.add(50);
		listArr.add(60);
		
		// List with Vectors
		List<Integer> listArrVector = new Vector<Integer>();
		listArrVector.add(40);
		listArrVector.add(50);
		listArrVector.add(60);
		
		
		// Collection
		Collection<Integer> arrList2 = new ArrayList<Integer>();
		
		for(Integer item: arrList2) {
			System.out.println(item);
		}	
		
		//arrList2.set(2,231); ----errorss out on Index a
		
	}

}
