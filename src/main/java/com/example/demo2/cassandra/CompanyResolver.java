package com.example.demo2.cassandra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class CompanyResolver implements GraphQLResolver<Company> {

	@Autowired
	private CompanyRepository companyRepository;
	
	/*
	 * public List<Employee> employees(Company company) { return
	 * companyRepository.findById(company.getId()).get().getEmployees(); }
	 */

}
