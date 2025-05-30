package com.generics;

import java.util.ArrayList;


public class GenericsTest {

	public static void main(String[] args) {

//		Example<Integer> e1 = new Example<>(); 
		ArrayList al3 = new ArrayList();
		al3.add(new Integer(5));
		al3.add(new Double(5.4));
		al3.add(new Character('a'));
		al3.add("Hari");

		Object obj;
		Integer io;
		int i;
		String s;
		obj = al3.get(2);
		// io = (Integer)obj; 
		// i = io.intValue(); 
		System.out.println(obj);

		obj = al3.get(3);
		s = (String) obj; 
		System.out.println(s.toUpperCase());
		
		ArrayList<Integer> al4= new ArrayList<>();
		al4.add(7);
		al4.add(9);		//AB
		al4.add(10);
		al4.add(11);
		
		int i2 = al4.get(0);  //Generics,  AUB , no casting, so no CCE 
		System.out.println(i2);
		
		

	}

}
