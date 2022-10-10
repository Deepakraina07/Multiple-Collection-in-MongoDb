package com.samco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.EmployeeDetails;
import com.samco.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService {

	
	@Autowired
	EmployeeDetailsRepository detailsRepository;
	
	public EmployeeDetails addEmployee(EmployeeDetails employeeDetails) {
		return detailsRepository.save(employeeDetails);
	}
	
	public List<EmployeeDetails> getAllEmployee(){
		return detailsRepository.findAll();
	}
}
