package com.java8;

public class TestI {

	public static void main(String[] args) {
		System.out.println("main start");
		Addition a1 = (a, b) -> System.out.println(a + b);
		Mul m1 = (a, b) -> System.out.println(a / b);
		Sub s1 = (a, b) -> System.out.println(a - b);

		a1.add(10, 20);
		m1.mul(10, 20);
		s1.sub(10, 20);
		AO ao1 = (a, b) -> System.out.println("Addition result: " + (a + b));
		AO ao2 = (a, b) -> System.out.println("Addition result: " + (a - b));
		AO ao3 = (a, b) -> System.out.println("Addition result: " + (a - b));
		ao1.ao(10, 20);
		ao2.ao(10, 20);
		ao3.ao(10, 20);

		AOG<Integer> ag1 = (a, b) -> System.out.println("Addition result: " + (a + b));
		AOG<Double> ag2 = (a, b) -> System.out.println("Addition result: " + (a + b));
		AOG<String> ag3 = (a, b) -> System.out.println("Addition result: " + (a + b));
		ag1.ao(10, 20);
		ag2.ao(10.5, 20.7);
		ag3.ao("H", "K");
		System.out.println();

		// AOR<Integer, Integer> ar1 = (a, b) -> { return a+b; };
		// AOR<Double, Double> ar2 = (a, b) -> { return a+b; };
		// AOR<String, String> ar3 = (a, b) -> { return a+b; };

		AOR<Integer, Integer> ar1 = (a, b) -> a + b;
		AOR<Double, Double> ar2 = (a, b) -> a - b;
		int aRes = ar1.ao(50, 20);
		double dRes = ar2.ao(50.5, 20.7);
		// String sRes = ar3.ao("N", "iT");
		
		System.out.println("Addition result: " + aRes);
		System.out.println("Addition result: " + dRes);
		// System.out.println("Addition result: "+ sRes);

		// method

		Calculate c1 = (a, b) -> System.out.println(a + b);
		c1.cal(10, 40);
		Calculate c2 = (a, b) -> Add1.m1(a, b);
		c2.cal(20, 57);
		
		Calculate c3 =  Add1::m1; 	//create MR (short-cut of LE creation)
		c3.cal(10, 20);		//Static method reference
		System.out.println();
		
		Calculate c4 = new Add1()::m2; 	//non-static method reference
		c4.cal(10, 20);
		System.out.println();
		
		Calculate c6 = (a, b) -> { new Add1(a, b); };
		c6.cal(10, 20);
		Calculate c7 = Add1::new;	//constructor reference
		c7.cal(10, 20);

	}

}
