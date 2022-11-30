package com.stringpractice;

public class Examples {

	public static void main(String[] args) {
		String s1="darshana";
		String s2="darshan";
		String s3= new String("rutwik");
		String s4= new String("rutwik");
		String s5= new String("DARSHAN");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s5));
		
		

	
	}

}
