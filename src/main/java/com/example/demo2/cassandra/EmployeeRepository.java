package com.example.demo2.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, String> {

}
