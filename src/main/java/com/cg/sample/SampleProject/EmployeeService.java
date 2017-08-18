package com.cg.sample.SampleProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Employee> list =Arrays.asList(new Employee(111, "Roshan", "Washim"),
			new Employee(222, "Vishwas", "Hyderabad")
			);
	
	public List<Employee> getAllEmployess(){
		return list;
		
	}
}
