package com.example.demo2.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CompanyRepository extends CassandraRepository<Company, String> {

}
