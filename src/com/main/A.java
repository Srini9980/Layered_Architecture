package com.main;
// rules of access of overriding
public class A {
	void m1() {
		System.out.println("m1 inside A");
	}

}

class B extends A {
	
	public void m1() {
		System.out.println("m1 inside A");
	}
	
}
