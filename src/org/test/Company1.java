package org.test;

public class Company1 extends Employee1 {
	
	private void comId() {
		System.out.println("Company Id is 1000");

	}

	public static void main(String[] args) {
		
		Company1 c=new Company1();
		c.comId();
		
		Employee1 e=new Employee1();
		e.empId();
	}
}
