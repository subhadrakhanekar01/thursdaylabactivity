package com.question3;

import java.util.Scanner;
import java.lang.ClassNotFoundException;

public  class CheckedName extends Exception
{
		void validateName(String name) throws ClassNotFoundException
		{
			String[] names= {"Subhadra","Sakshi","Rutuja","Sonali"};			
			boolean found=false;		
			for(String n: names)
			{
				if(n.equalsIgnoreCase(name))						
				{
					found=true;
					break;
				}
			}
			if(found)
			{
				System.out.println("the name is valid");			
			}
			else
			{
				throw new ClassNotFoundException("Invalid name,please try again");		 
			}
		}
	public static void main(String[] args)
	{
		CheckedName uk=new CheckedName();			
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the name");
				String name=sc.next();				
				try
				{
					uk.validateName(name);				
					}
				catch(ClassNotFoundException e)				
				{
					System.out.println("Invalid name");
				}
				}
}
