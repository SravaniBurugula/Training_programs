package com.ibm.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper<T> implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setFirstName(rs.getString("FirstName"));
	    employee.setLastName(rs.getString("LastName"));
	    employee.setSalary(rs.getInt("Salary"));
	      
		return employee;
	}

}
