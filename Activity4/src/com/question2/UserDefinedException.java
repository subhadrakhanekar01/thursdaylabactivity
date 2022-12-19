package com.question2;

import java.util.Scanner;

class  InvalidAgeWeightException extends Throwable
{
	public InvalidAgeWeightException() {
		super();
	} 	
}

public class UserDefinedException
{
	float weight;
	int age;
	
	public UserDefinedException(float weight, int age) {
	
		this.weight = weight;					
		this.age = age;
		try
		{
			if(age<18 || weight<50)						
			{
				throw new InvalidAgeWeightException();			
				
			
			}
		}
		catch(InvalidAgeWeightException i)					
		{
			System.out.println(i);
		}
	}
	void display()
	{
		System.out.println("weight of the person is "+weight);
		System.out.println("age of the person is "+age);				
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person weight");						
		float weight=sc.nextFloat();
		System.out.println("Enter the person age");							
		int age=sc.nextInt();
		
		UserDefinedException c=new UserDefinedException(weight,age);			
		c.display();								

	}




}
