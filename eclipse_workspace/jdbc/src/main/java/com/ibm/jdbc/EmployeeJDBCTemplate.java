package com.ibm.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
public class EmployeeJDBCTemplate implements EmployeeDAO {
    private DataSource datasource;
    private JdbcTemplate jdbcTemplateObject;
	@Override
	public void setDataSource(DataSource datasource) {
		this.datasource=datasource;
		this.jdbcTemplateObject = new JdbcTemplate(datasource);

	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		String SQL= "insert into Employees(firstname,lastname,salary) values(?,?,?)";
        jdbcTemplateObject.update(SQL,firstName,lastName,salary);
        System.out.println("Created Record Name= "+ firstName +"Salary" + salary);
	}

	@Override
	public Employee getEmployee(Integer id) {
		String SQL= "select * from Employee where id= ?";
		Employee employee = (Employee) jdbcTemplateObject.queryForObject(SQL, new EmployeeMapper());
	
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		String SQL = "select * from Employees";
		List<Employee> employees = (List<Employee>) jdbcTemplateObject.query(SQL,new EmployeeMapper());
		return employees;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Employee where id= ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID= "+ id);

	}

	@Override
	public void update(Integer id, String firstName, String lastName) {
		String SQL = "update Employees set salary = ? where id= ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Updated Record with ID " + id);

	}

}
