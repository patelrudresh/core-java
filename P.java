package com.java8;

public interface P {
	abstract void m1();
	//abstract void m3();
	 default void m2() {
		 System.out.println("interface default method from interface P");
	 }
}
