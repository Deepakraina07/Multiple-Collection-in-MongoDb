package com.samco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.Employee;
import com.samco.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getByEmployee(int id) {
		return employeeRepository.findById(id);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(addEmployee(employee));
	}
	
	public void deleteAllEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
	
	public void deleteByEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
