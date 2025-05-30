package com.java8;

interface I2 {
	void m1();
	default void m2() { System.out.println("DM m2 from interface I2");};
	static void m3(){ }
	   private static void m4(){ }
	   private void m5(){ }
}
interface I3 { //not a FI
	   void m1();
	   void m2();
	}