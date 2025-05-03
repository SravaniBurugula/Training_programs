package com.ibm.PracticePrograms;

public class FullTimeEmployee extends Employee {

	private double salary;

	FullTimeEmployee(String name, int empid, double salary) {
		super(name, empid);
		this.salary=salary;
		
	}

	double displayPaymentDetails() {
		return salary;
		
		
		
		

	}

}
