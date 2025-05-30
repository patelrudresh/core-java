package com.generics;

import java.util.stream.Stream;

public class Test11MR {
	public static void main(String[] args) {
		Wish wish1=(wishMessage)->{
			System.out.println(wishMessage);
		};
		wish1.wish("Good Morning");
		Wish wish2 =System.out::println;
		wish2.wish("bad Morning");
		System.out.println();
		
		String data ="""
					hi mama 
					how are you ?
					what are you doing ?
				""";
		Stream <String> lines1=data.lines();
		lines1.forEach(line -> System.out.println(line) );
		System.out.println();
		
		Stream<String> lines2 = data.lines();
		lines2.forEach(System.out::println);
;		
	}
}
