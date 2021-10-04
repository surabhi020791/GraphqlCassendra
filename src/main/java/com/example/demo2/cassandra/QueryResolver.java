package com.example.demo2.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import graphql.kickstart.tools.GraphQLQueryResolver;

@Service
public class QueryResolver implements GraphQLQueryResolver {
	
	@Autowired
	private MessageService messageService;
	
	public String getMessage( ) {
        return messageService.getMessage();
    }
	
	public int helloRandom( ) {
        return messageService.helloRandom();
    }
	public String helloMessage( ) {
        return messageService.getMessage();
    }

    
	public List<Employee> employees( ) {
        return messageService.getAllEmployees();
    }
	
	public List<Company> getCompanies( ) 
	{
        return messageService.getAllCompanies();
    }
	
	public List<Technology> getTechnologies( ) 
	{
        return messageService.getAllTechnology();
    }
	
	public String message( ) {
        return messageService.getMessage();
    }
	
	public Employee getEmployeeById(String employeeId)
	{
		return messageService.getEmployeeById(employeeId);
	}
	public Company getCompanyById(String companyId)
	{
		return messageService.getCompanyById(companyId);
	}

}
