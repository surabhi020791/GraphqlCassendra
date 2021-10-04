package com.example.demo2.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class EmployeeResolver implements  GraphQLResolver<Employee> {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public String fullName(Employee employee)
	{
		return employee.getFirstName()+" "+employee.getLastName();
	}
	
	/*
	 * public Company getCompany(Employee employee) { return
	 * employeeRepository.findById(employee.getId()).get().getEmpcompany(); }
	 */

}
