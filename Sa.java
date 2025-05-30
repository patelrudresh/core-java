package com.java8;

public class Sa implements I1,I2 {
	public void m1() { 
		System.out.println("AM is executed from class Sa");
	}
	 public void m2() {
		 //I1.super.m2();
		 I2.super.m2();
	 }
}
