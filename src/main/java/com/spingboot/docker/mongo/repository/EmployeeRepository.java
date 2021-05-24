package com.spingboot.docker.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spingboot.docker.mongo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
