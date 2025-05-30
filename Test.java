package com.generics;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
		
		int[] ia = {5, 6, 7, 8};
		System.out.println(ia[0]);
		System.out.println(ia[1]);			//static nature code
		System.out.println(ia[2]);
		System.out.println(ia[3]);
	   //System.out.println(ia[4]);
		System.out.println();
		
		for(int index=0; index<ia.length; index++) {		//only values
			//for(int index=0; index<=ia.length; index++) {		//values + AIOOBE
				int value = ia[index];
				System.out.println(value); //blogic
				
			}
			System.out.println();
			
			for(int value : ia ) {	
				System.out.println(value);
				
			}
			System.out.println();
			for(int i=0; i<ia.length; i++) {
				int value = ia[i];
				ia[i] = value + 10;
			}
			
			//Retrieving and printing by using for-each loop
			for(int value:ia ) {
				System.out.print(value + " " );
			}
			System.out.println();
			
			//AB, AUB, Generics and for-each loop	
			ArrayList<Integer> al1 = new ArrayList<>();		//generics
			al1.add(5);
			al1.add(6);
			al1.add(7);			//AB
			al1.add(8);
			al1.add(9);
			
			for(int value : al1) {
				System.out.println(value);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
  }
}
