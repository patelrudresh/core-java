package com.stringHandlling;

import java.util.Arrays;

public class StringOBject {
	public static void main(String[] args) {
//		String s1="hy";
//		String s2=s1;
//		System.out.println(s1);
//		System.out.println(s2);
//		String s1 = "AK";
//		s1.concat(", RK");
//		System.out.println(s1);
//		
//		String s2 = s1.concat(", RK");
//		System.out.println(s1);		//HK
//		System.out.println(s2);		//HK, NiT
//		
//		String s3 = "Hyd";
//		s3 = "Sec";
//		System.out.println(s3);

//		String s3 = new String("IT");	
//		String s4 = new String("IT");	
//		System.out.println(s3==s4);	
//		String s8 = "TG";  
//		s8 = null;
//		System.out.println(s8);	

		System.out.println();

		String s1 = "";
		String s2 = " ";
		String s3 = "Hari";

		System.out.println(s1.isEmpty() + "\t" + s1.isBlank());
		System.out.println(s2.isEmpty() + "\t" + s2.isBlank());
		System.out.println(s3.isEmpty() + "\t" + s3.isBlank());

		System.out.println();
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s1.length() == 0);
		System.out.println(s1.length() != 0);
		System.out.println();

		System.out.println(s1.trim().length() == 0);
		System.out.println(s2.trim().isBlank());
		System.out.println();

		String s4 = "HK";
		String[] s5 = { "HK", "BK", "PK" };
		// System.out.println(s5.isEmpty());
		// System.out.println(s5.length());
		System.out.println(s5.length);
		System.out.println(s4.length());
		System.out.println();

		s1 = "hari";
		s2 = "hari";
		s3 = "Hari";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println();
		s1 = "HK";
		s2 = "HK";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		s3 = new String("NiT");
		s4 = new String("NiT");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		String s6 = "Hyd";
		String s7 = "hyd";
		System.out.println(s6 == s7);
		System.out.println(s6.equals(s7));
		System.out.println(s6.equalsIgnoreCase(s7));
		System.out.println();

		StringBuffer sb1 = new StringBuffer("Hyd");
		System.out.println(s6.equals(sb1));
		StringBuilder sb2 = new StringBuilder("Hyd");
		System.out.println(s6.contentEquals(sb2));

		String s8 = "Hyd";
		System.out.println(s6.contentEquals(s8));
		System.out.println();

		s1 = "abc";
		s2 = "abc";
		s3 = "bbc";
		s4 = "Abc";
		System.out.println(s1.compareTo(s2));

		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println();

		s1 = "Java Hari Krishna Hari NiT Hari";
		System.out.println(s1.equals("Hari"));
		System.out.println(s1.contains("Hari"));
		System.out.println(s1.contains("hari"));
		System.out.println(s1.toLowerCase().contains("hari"));
		System.out.println(s1.toUpperCase().contains("HARI"));
		System.out.println();

		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("Java"));
		System.out.println(s1.endsWith("Hari"));
		System.out.println(s1.startsWith("Hari"));
		System.out.println(s1.startsWith("java"));
		System.out.println(s1.endsWith("hari"));

		System.out.println(s1.contains("a"));

		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("a"));

		System.out.println(s1.indexOf("Hari"));

		System.out.println(s1.contains("A"));
		System.out.println(s1.indexOf("A"));
		System.out.println(s1.indexOf("hari"));
		System.out.println(s1.indexOf('a', 2));
		System.out.println(s1.indexOf("Hari", 7));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf('a', 18));
		System.out.println(s1.lastIndexOf("Hari", 20));
		System.out.println(s1.indexOf("Hari", 25));
		System.out.println();
		s1 = "Java is an object-oriented Programming Language";
		char ch = s1.charAt(0);
		System.out.print(ch);
		System.out.print(s1.charAt(4));
		System.out.println(s1.charAt(9));
//		System.out.println(s1.charAt(-1));
		// System.out.println(s1.charAt(s1.length()));
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println();
		System.out.println(s1.substring(5, 11));
		System.out.println(s1.substring(5, 12));
		System.out.println(s1.subSequence(5, 12));

		int start = s1.indexOf("Program");
		int end = start + 15;
		System.out.println(s1.substring(start, end));

		s1 = "Java Hari Krishna";
		String[] words = s1.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(Arrays.toString(s1.split("a")));
		System.out.println(Arrays.toString(s1.split("J")));
		System.out.println(Arrays.toString(s1.split("Java Hari Krishna")));

		System.out.println(Arrays.toString(s1.split("Krishna")));

		s1 = "abc";
		char[] ca = s1.toCharArray();
		System.out.println(Arrays.toString(ca));

		byte[] ba = s1.getBytes();
		System.out.println(Arrays.toString(ba));

		int i1 = 15;
		long l1 = 9010454584L;
		double d1 = 10.5;
		// Example e1 = new Example(19);
		String pString;
		// pString = ""+i1;
		// pString = Integer.toString(i1);
		pString = String.valueOf(i1);

		pString = String.valueOf(l1);
		// pString = String.valueOf(d1);
		// pString = String.valueOf(e1);
		System.out.println(pString);
		System.out.println();

		s1 = "HK";
		s1.concat(" NiT");
		System.out.println(s1);
		System.out.println();

		s2 = s1.concat(" NiT");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();

		s3 = s1.concat(" NiT");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2 == s3);
		System.out.println(s1.concat(" NiT"));
		System.out.println();

		s1 = s1.concat(" NiT");
		System.out.println(s1);
		System.out.println();

		s1 = s1 + " Hyd";
		System.out.println(s1);

		s1 = "a";
		s1 = s1.concat("b").concat("c").concat("d");
		System.out.println(s1);
		s1 = "a";
		s1 = s1 + "b" + "c" + "d";
		System.out.println(s1);
		System.out.println();

		s1 = "a";
		s2 = s1.concat("");
		System.out.println(s1 == s2);

		s1 = "a";
		s2 = s1 + "";
		System.out.println(s1 == s2);

		s7 = String.join(" ", "a", "b", "c", "d");
		System.out.println(s7);
		s1 = String.join("-", "a", "b", "c", "d");
		System.out.println(s1);
		
		s1 = "a".concat("-").concat("b").concat("-").concat("c").concat("-").concat("d");
		System.out.println(s1);
		
		s1 = "a"+"-"+"b"+"-"+"c"+"-"+"d";
		System.out.println(s1);
		
		s1 = String.join("", "a", null);
		System.out.println(s1);
		System.out.println();
		
		s1 = "Abc Bbc Cbc";
		s1.toLowerCase();
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		s3 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2 == s3);
		System.out.println();
		
		System.out.println(s1.toLowerCase());
		
		s1 = "abc";
		s2 = s1.toLowerCase();
		System.out.println(s1 == s2);
		System.out.println();
		s1 = "Abc";
		s2 = s1.toLowerCase();
		s3 = s2.toLowerCase();
		System.out.println(s2 == s3);
		System.out.println();
		
		s1 = "abc";
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		
		s3 = s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		System.out.println();
		
		
			s1 = "1@3";
		s2 = s1.toUpperCase();
		System.out.println(s1==s2);
		
		
		s3 = s2.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2==s3);
		
		s1 = "null";
		s2 = s1.toUpperCase();
		System.out.println(s2); 
		System.out.println();			
		
		s1 = "abc bbc cbc";
		s1.replace('b', 'x');
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.replace('b', 'x');
		System.out.println(s1);
		System.out.println(s2);
		
		s3 = s1.replace("bc", "y");
		System.out.println(s1);
		System.out.println(s3);
		
		s4 = s3.replace("bc", "z");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		
		s1 = "abc 123 ebc";
//		s2 = s1.replaceAll("bc", "z");
//		System.out.println(s1);
//		System.out.println(s2);
		
		s3 = s1.replaceAll("[bc]", "z");
		System.out.println(s3);
		System.out.println();
		
		s4 = s1.replaceAll("[a-z]", "@");
		System.out.println(s4);
		s4 = s1.replaceAll("1", "%");
		System.out.println(s4);
		
		s4 = s1.replaceAll("12", "%");
		System.out.println(s4);
		
		s4 = s1.replaceAll("[12]", "%");
		System.out.println(s4);
		
		s4 = s1.replaceAll("[0-9]", "%");
		System.out.println(s4);

		s4 = s1.replaceAll(".", "^");
		System.out.println(s4);
		
		s4 = s1.replaceFirst(".", "^");
		System.out.println(s4);
		System.out.println();
		
		s1 = " abc bbc cbc   ";
		s1.trim();
		System.out.println(s1);
		System.out.println();
		
		s2 = s1.trim();
		System.out.println(s1);
		System.out.println(s2);
		
		s3 = s2.trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2 == s3);
		System.out.println();
		
		
		s1 = "  abc bbc cbc   ";
		s2 = s1.trim();
		s3 = s1.replace(" ", "");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		System.out.println();
		s1 = "  abc bbc cbc   ";
		s2 = s1.strip();
		s3 = s1.stripLeading();
		s4 = s1.stripTrailing();
		System.out.println(s1 + "Hi-" + s1.length());
		System.out.println(s2 + "Hi-" + s2.length());
		System.out.println(s3 + "Hi-" + s3.length());
		System.out.println(s4 + "Hi-" + s4.length());	
		
		
		s1 = "\0  ";
		s2 = s1.trim();
		s3 = s1.strip();
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		//=================================
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
