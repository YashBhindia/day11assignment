package com.masai;

public interface Y {

	void fun4();
	
	default void fun5() {
		System.out.println("Default method inside Y interface");
	}
	
	static void fun6() {
		System.out.println("Static method inside Y interface");
	}
}
