package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);
		al2.add(30);
		al2.add(40);
		System.out.println(al2);
		
		al1.addAll(al2);
		for(Integer i : al1) {
			System.out.println(i);
			
		}
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		al1.removeAll(al2);
		for(Integer x : al2) {
		  System.out.println(x);
		}
	}
	
	
}
