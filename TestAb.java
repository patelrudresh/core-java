package com.java8;

public class TestAb {
	public static void main (String [] args) {
		P   p1;
		
       //p1 = new P(); 
		p1 = new Q();
		p1.m1();		//either from class Q or from interface P 	
		p1.m2();		//based on overridden or not
		System.out.println();
		p1 = new R();
		p1.m1();
		p1.m2();
		System.out.println();
		
		p1 = new S();
		p1.m1();
		p1.m2();
		System.out.println();
		p1 = new T();
		p1.m1();	//executed from class T
		p1.m2();	//executed from class T
		System.out.println();
		
		p1 = new U();
		p1.m1();	//executed from class U
		p1.m2();	//executed from interface P
					//executed from class U
		System.out.println();
			
		Ex e1 = new Ex();	//Multiple inheritance is implemented
		e1.m1();	
		e1.m2();		//CE: ae is solved by overridden  	
			System.out.println();
			
		Sa s1 = new Sa();  	//Multiple inheritance is implemented
		s1.m1();			//DM is executed from both interfaces	
		s1.m2();	

	}
}
