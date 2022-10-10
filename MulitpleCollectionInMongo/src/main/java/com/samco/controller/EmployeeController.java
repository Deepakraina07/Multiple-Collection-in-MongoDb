package com.samco.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.Employee;
import com.samco.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping("/get")
	public List<Employee> get(Employee employee){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Employee> getById(@PathVariable("id") int id){
		return employeeService.getByEmployee(id);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete")
	public void delete(Employee employee) {
		employeeService.deleteAllEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		employeeService.deleteByEmployee(id);
	}
}
