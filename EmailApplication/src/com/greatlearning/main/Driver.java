package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.*;

public class Driver {
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Employee emp = new Employee("harshit","choudary");
			CredentialService cs = new CredentialService();
			
			
			String department=null,generatedEmail,generatedPassword;
			
			
//			Determine the department 		
			System.out.println("Please enter the department from the following");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resources");
			System.out.println("4.Legal");
		
			int deptIn = sc.nextInt();
			
			if(deptIn==1) {department="tech";}
			else if(deptIn==2) {department="admin";}
			else if(deptIn==3) {department="hr";}
			else if(deptIn==4) {department="legal";}
			
			
			generatedEmail = cs.generateEmailAddress(emp.getFirstName(),emp.getlastName(),department);
			generatedPassword=cs.generatePassword();
			
			
			cs.showCredentials(emp, generatedEmail,generatedPassword);

			sc.close();
	}
}
