package com.samco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.EmployeeData;
import com.samco.service.EmployeeDataService;

@RestController
@RequestMapping("/empdata")
public class EmployeeDataController {

	@Autowired
	EmployeeDataService employeeDataService;
	
	@PostMapping("/add")
	public EmployeeData add(@RequestBody EmployeeData data) {
		return employeeDataService.add(data);
	}
	
	@GetMapping("/get")
	public List<EmployeeData> get(){
		return employeeDataService.get();
	}
}
