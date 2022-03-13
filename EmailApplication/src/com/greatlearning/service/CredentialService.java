package com.greatlearning.service;

import com.greatlearning.model.*;

public class CredentialService {

	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	
	public String generatePassword()
	{
		int a;
		char b,c,d,e;
		char spl;
		
		a=(int)(Math.random()*(999-100+1)+100); 
		//random 3 digit number
		String s=Integer.toString(a);
		
		
		spl=(char)(Math.random()*(64-58+1)+58);
		//random special character with ascii values between 58 and 64
		
		b=(char)(Math.random()*(122-97+1)+97); 
		// generating a small alphabet
		
		c=(char)(Math.random()*(90-65+1)+65);
		// generating a caps alphabet with ascii value between 65 and 90
		
		d=(char)(Math.random()*(90-65+1)+65);
		// generating a caps alphabet with ascii value between 65 and 90
		
		e=(char)(Math.random()*(90-65+1)+65);
		// generating a caps alphabet with ascii value between 65 and 90
		
		
		//returning the concatenation
		return s+c+spl+b+d+e;
	}
	
	public void showCredentials(Employee emp, String email , String password)
	{
		System.out.println("Dear " + emp.getFirstName()+ " your generated credentials are as follows");
		System.out.println("Email        --->  "+email);
		System.out.println("Password ---> "+password);
	}
	
	
	}


