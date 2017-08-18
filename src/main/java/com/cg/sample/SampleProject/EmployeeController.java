package com.cg.sample.SampleProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empservice.getAllEmployess();
	}
	
}
