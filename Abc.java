package com.java8;

public interface Abc {
void m1();
static void m3() {}
}
class Abc1 implements Abc {
	public void m1() { }		//mandatory to implement
	
	public void m4() {
		m1();
		
		
		//m3();				//Abc1.m3();
		//this.m3();			//Abc1.m3();
		//super.m3();			//Object.m3();
		//Abc.super.m3();		//Abc.'Abc1.Abc'.m3();
		
		Abc.m3();
		
	}
	//for complete notes and IQs refer material drive
}
