package com.samco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.Employee;
import com.samco.model.EmployeeDetails;
import com.samco.service.EmployeeDetailsService;

@RestController
@RequestMapping("/emp")
public class EmployeeDetailsController {

	@Autowired
	EmployeeDetailsService detailsService;
	
	@PostMapping("/add")
	public EmployeeDetails add(@RequestBody EmployeeDetails employeeDetails) {
		return detailsService.addEmployee(employeeDetails);
	}
	
	@GetMapping("/get")
	public List<EmployeeDetails> get(EmployeeDetails employeeDetails){
		return detailsService.getAllEmployee();
	}
}
