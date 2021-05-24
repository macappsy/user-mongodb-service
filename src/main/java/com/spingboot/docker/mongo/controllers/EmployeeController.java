package com.spingboot.docker.mongo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spingboot.docker.mongo.model.Employee;
import com.spingboot.docker.mongo.repository.EmployeeRepository;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepository;
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee employee) {
		empRepository.save(employee);
		return "employee added successfully::"+employee.getId();
		
	}
	
	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees() {
	
		List<Employee> listEmp = empRepository.findAll();
		System.out.println("List of all Employees are - "+ listEmp.toString());
		return listEmp;
	}

	@GetMapping("/findEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		Optional<Employee> optEmployee = empRepository.findById(id);
		System.out.println("Employees details - "+ optEmployee.toString());
		return optEmployee;
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empRepository.deleteById(id);
		return "Deleted Employee Successfully::"+id;
	}
	

}
