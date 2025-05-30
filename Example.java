package com.generics;

class Example<T> {  //Generic parameter class
	 void m1(T i) {	  //Generic parameter method
		System.out.println(i.getClass().getSimpleName() + " type value passed");
	}
	
	static <T> void m2(T t) {	//static generic method
		System.out.println(t.getClass().getSimpleName() + " type value passed");
	}
	
	public static void main(String[] args) {
		Example a=new Example();
		a.m1("G");
	
	}
}
