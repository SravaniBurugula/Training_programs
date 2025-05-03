package com.ibm.PracticePrograms;

public class Application
{
	public static void main( String[] args )
	{
		Employee fulltimeemployee= new FullTimeEmployee("Alice", 101, 5000);
		Employee intern= new Intern("Bob", 102, 20);
		
		System.out.println("Salary: " + fulltimeemployee.displayPaymentDetails());
		System.out.println("Stpend " +intern.displayPaymentDetails());
		
	}
}