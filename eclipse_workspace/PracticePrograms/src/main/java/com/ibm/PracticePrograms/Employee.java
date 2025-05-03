package com.ibm.PracticePrograms;

abstract public class Employee {
	//instance variables
	String name;
	int empid;
	
	Employee(String name, int empid){// constructor
		this.name= name;
		this.empid=empid;
		}
	abstract double displayPaymentDetails();// abstract method
	

	

}
