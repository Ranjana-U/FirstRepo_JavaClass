package org.test;


//default access specifiers
//cannot extend or create object for methods from another package
public class Company2 extends Employee2 {

	 void comId() {
		System.out.println("Company id is 1000");

	}
	 
	 public static void main(String[] args) {
		Company2 cmp=new Company2();
		cmp.comId();
		cmp.empId();
		
	}
}
