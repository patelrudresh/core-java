package com.stringHandlling;

import java.util.Scanner;

// Read user name from keyboard.
//If user entered empty string as user name
//print error message "Enter Username".
//Else
//print Welcome to NIT    
public class Welcomeuser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter your username: ");
//		String name = sc.nextLine();
//
//		if (name.isEmpty()) {
//			System.out.println("enter use name");
//		} else {
//			System.out.println("welcome our page");
//		}
//		sc.close();

//		   P2.
//	        Read name from keyboard.
//	        Print number of characters available in the give name.
//	       
//	          input: Hari Krishna
//	          output: Hari Krishna has 12 characters
//		int len= name.length();
//		//System.out.println(name.length()); 
//		System.out.println("name"+name+"charactor is "+len);
//		
//		  P3.
//	        Read a password from keyboard.
//	        Check whether it has characters in between 8, 16
//	        Else print error message
//	            "Password length must be in between 8, 16"
//		System.out.println("enter the password");	
//		String password =sc.nextLine();
//		int len =password.length();
//		if(len>8 && len<16) 
//		{
//			System.out.println("password accepted");

//		}else 
//			System.out.println("Password length must be in between 8, 16");
//		
//	
//			P4.
//        Read mobile number from keyboard and
//        Check whether it has 10 digits or not,
//        If not print error message
//            "Mobile number must contains 10 digits"
//       
//        If it has 10 digits, check those are really digits or not
//        Else print error message
//            "mobile number should contain only digits"
//       
//            input1:
//                Enter mobile number: 9010454584
//            output:
//                Activation code is sent to ur register mobile number
//                Enter it in the next screen to active your account.
//       
//            input2:
//                Enter mobile number: 99443322112
//            output:
//                mobile number should contain 10 digits
//       
//            input2:
//                Enter mobile number: 9944one222
//            output:
//                mobile number should contain only digits

//		System.out.print("Enter mobile number: ");
//		String mobileNumber = sc.nextLine();
//
//		if (mobileNumber.length() != 10) {
//			System.out.println("   mobile number should contain 10 digits");
//		}else if(!mobileNumber.matches("\\d+")) {
//			 System.out.println("mobile number should contain only digits");
//			
//		}else {
//            System.out.println("Activation code is sent to ur register mobile number");
//            System.out.println("Enter it in the next screen to active your account.");
//        }
//		

//		Read name from keyboard.
//        Print it back on console with its number of characters.
//        If it is empty print msg: name is empty
//       
//            input:    
//            Enter name: Hari
//            output:    Hi Hari
//                Your name has 4 characters

//		System.out.print("Enter  name ");
//		String name= sc.nextLine();
//		if(name.isEmpty()) {
//			System.out.println("name is empty");
//		}else {
//			System.out.println("hi "+name );
//			System.out.println("length is "+name.length());
//		}

//		   P6:
//		        Develop a project to store all values of a Student as one
//		        object. If we display this student object, all values of this
//		        object must be displayed, but not as classname@hashcode
//		
//       System.out.println("enter the name");
//       String name=sc.nextLine();
//       System.out.println("enter the age");
//       int age=sc.nextInt();
//       System.out.println("enter the rollnumber");
//       int rollNumber=sc.nextInt();
//       System.out.println("enter the course");
//       String course=sc.nextLine();
//       
//       Student student=new Student(name, age, course, rollNumber);
//       System.out.println(student);
//         P7.
//        Read user name, password from keyboard and
//            check if they are Hari & Nit#1
//        If not print error message
//            "Invalid user name or password"
		
//		final String Validname="hari";
//		final String validpassword="Nit#1";
//		
//		 System.out.print("Enter user name: ");
//	        String username = sc.nextLine();
//
//	        System.out.print("Enter password: ");
//	        String password = sc.nextLine();
//		if(username.equals(Validname)&&password.equals(validpassword)) {
//			System.out.println("Login successful!");
//		}else
//			System.out.println("\"Invalid user name or password\"");
//	}
//}
//
////class Student {
//	String name;
//	int age;
//	String course;
//	int rollNumber;
//
//	public Student(String name, int age, String course, int rollNumber) {
//		this.name = name;
//		this.age = age;
//		this.rollNumber = rollNumber;
//		this.course = course;
//	}
//
//	@Override 
//	public String toString() {
//		return "student details:\n"+ "name "+name+" \n"+
//	   "age"+age+"\n"+"rollnumber"+rollNumber+"\n"+"course"+course;
//	}
//}