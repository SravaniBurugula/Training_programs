package com.ibm.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate =(EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplate");
		System.out.println(".......Records Creation........");
		employeeJDBCTemplate.create("Smitha","Raj",150000);
		employeeJDBCTemplate.create("Allen","Peter",250000);
		
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		
//		for(Employee employee: employees) {
//			System.out.println("ID: "+ employee.getFirstName());
//			System.out.println("ID: "+ employee.getLastName());
//			System.out.println("ID: "+ employee.getSalary());
//		}
//		employeeJDBCTemplate.update(1,"","",20000);
//		
//		Employee employee = employeeJDBCTemplate.getEmployee(2);
//		System.out.print("ID:"+employee.getId());
//		System.out.print("ID:"+employee.getFirstName());
//		System.out.print("ID:"+employee.getLastName());
//		System.out.print("ID:"+employee.getSalary());	
	}
}
