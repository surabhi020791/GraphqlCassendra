package com.example.demo2.cassandra;

import java.util.List;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Company {
	
	@PrimaryKey
	@Column(value = "id")
    private String id;
	@Column(value = "comapny_name")
    private String name;
	@Column(value = "comapny_desc")
    private String description;
	//private List<Employee> employees;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
    
    

}
