package org.test;

import org.test.tcs.ClientDetails;

public class Company extends Employee {

	private void ComId() {
		System.out.println("Company Id is 1000");

	}
	
	private void Ranjana_Branch1() {
		System.out.println("Code for Ranjana-Branch1");

	}
	public static void main(String[] args) {
		
		Company c=new Company();
		c.ComId();
		
		//without creating object
		c.empId(); 
		c.clientId();
		
		// By Creating object
		Employee e=new Employee();
		e.empId();
		
		ClientDetails client=new ClientDetails();
		client.clientId();
	}
	
	
}
