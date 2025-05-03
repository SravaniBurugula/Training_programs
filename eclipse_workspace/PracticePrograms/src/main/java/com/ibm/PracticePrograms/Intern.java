package com.ibm.PracticePrograms;

public class Intern extends Employee {
	double stipend;

	Intern(String name, int empid,double stipend ) {
		super(name, empid);
		this.stipend=stipend;
	}

	double displayPaymentDetails() {
		return stipend;
		
	}

}
