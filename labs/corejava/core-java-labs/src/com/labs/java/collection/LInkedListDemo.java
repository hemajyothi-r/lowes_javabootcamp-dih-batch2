package com.labs.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LInkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nos = new int[3];
		nos[0] = 10;
		nos[1] = 20;
		nos[2] = 30;
		
		for (int i: nos) {
			System.out.println(i);
			
		}
			
		List<Integer> arrList = new LinkedList();
		
		List<String> arrStrList = new LinkedList();
		
		arrList.add(40);
		arrList.add(50);
		arrList.add(60);
		
		for(Object item: arrList) {
			System.out.println(item);
		}
			
		
		arrList.set(2, 100);
		
		System.out.println("Array list after update");
		for(Object item: arrList) {
			System.out.println(item);
		}
		
		
		//updating 
		arrList.set(2, 100);
		System.out.println("Array list after update");
		for(Integer item: arrList) {
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
		
		
		
	}

}
