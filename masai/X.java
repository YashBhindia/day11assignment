package com.masai;

public interface X {

	void fun1();
	
	default void fun2() {
		System.out.println("Default method inside X interface");
	}
	
	static void fun3() {
		System.out.println("Static method inside X interface");
	}
}
