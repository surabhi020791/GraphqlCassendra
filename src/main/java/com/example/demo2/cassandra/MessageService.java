package com.example.demo2.cassandra;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessageService {
	
	static final String message = "Hello GraphQL";
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private TechnologyRepository technologyRepository;
	@Autowired
	MessageBean messageBean;
	
	public String message()
    {
    	return message;
    }
	
	public MessageService() {
		super();
	}
	public String getMessage() {
		return messageBean.getMessage();
	}
	public void setMessage(String message) {
		this.messageBean.setMessage(message);
	}
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employee= new ArrayList<>();
		this.employeeRepository.findAll().forEach(employee::add);
		return employee;
	}

	public int helloRandom() {
		// TODO Auto-generated method stub
		return (int)Math.random();
	}

	public List<Company> getAllCompanies() {
		List<Company> company= new ArrayList<>();
		this.companyRepository.findAll().forEach(company::add);
		return company;
	}

	public List<Technology> getAllTechnology() {
		List<Technology> tech= new ArrayList<>();
		this.technologyRepository.findAll().forEach(tech::add);
		return tech;
	}

	public Employee getEmployeeById(String employeeId) {
		Employee employee = null;
		Optional<Employee> employeeOptional = employeeRepository.findById(employeeId);
		if(employeeOptional.isPresent())
			employee = employeeOptional.get();
		return employee;
	}

	public Company getCompanyById(String companyId) {
		Company company = null;
		Optional<Company> companyOptional = companyRepository.findById(companyId);
		if(companyOptional.isPresent())
			company = companyOptional.get();
		return company;
	}

	

}
