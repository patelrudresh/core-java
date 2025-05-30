package com.java8;

class Ex implements I1, I2 {		//CE: ae from default method
	public void m1() { 
		System.out.println("AM is executed from class Ex");
	}
	public void m2() { 
		System.out.println("DM is executed from class Ex");
	}

}
