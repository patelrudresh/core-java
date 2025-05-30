package com.java8;

 public class Q implements P {
	
	public void m1() {
		System.out.println("hllo p q");
	}

}

 class R implements P {
	public void m1() { System.out.println("interface abstract method from class R");}
}

 class S implements P {
	public void m1() { System.out.println("interface abstract method from class S");}
}
 
 class T implements P {
		@Override
		public void m1() {
			System.out.println("interface abstract method from class T");
		}
		
		@Override
		public void m2() {
			System.out.println("interface default method from class T");
		}
		
	}
 
 class U implements P {
		@Override
		public void m1() {
			System.out.println("interface abstract method from class U");
		}
		
		@Override
		public void m2() {
			//super.m2();
			
			P.super.m2();
			System.out.println("interface default method from class U");
			P.super.m2();
		}
		
	} 