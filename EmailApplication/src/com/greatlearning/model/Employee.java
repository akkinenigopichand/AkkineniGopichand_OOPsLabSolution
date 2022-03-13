package com.greatlearning.model;

import java.util.Scanner;

public class Employee {
	
	public String firstName,lastName;
	public String department;
	Scanner sc = new Scanner(System.in);

	public Employee(String a,String b)
	{firstName=a;
	lastName=b;}
	
	
	
	public String getFirstName()
	{
		return firstName;
	}

	public String getlastName()
	{
		return lastName;
	}
	
}
