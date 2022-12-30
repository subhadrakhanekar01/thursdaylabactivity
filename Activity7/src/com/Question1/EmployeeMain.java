package com.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Rutuja",19,30000);
		Employee e2=new Employee(2,"Sakshi",20,22000);
		Employee e3=new Employee(3,"Subhadra",18,20000);
		Employee e4=new Employee(4,"Pallavi",22,25000);
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		Collections.sort(al);
		for(Employee e:al)
		{
			System.out.println( e.id+" "+e.name+" "+e.age+" "+e.salary);
		} 
		
		
		

	}

}