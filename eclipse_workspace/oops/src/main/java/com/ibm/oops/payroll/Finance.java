package com.ibm.oops.payroll;

public class Finance {
	public void processSalary(Employee employee) {
		employee.salary();
		if(employee instanceof Permanent) {
			Permanent parmanentEmployee=(Permanent) employee;
			permanentEmployee.transportation();
			
		}
		
	}

}
