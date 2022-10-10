package com.samco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.EmployeeData;
import com.samco.repository.EmployeeDataRepository;

@Service
public class EmployeeDataService {

	@Autowired
	EmployeeDataRepository dataRepository;
	
	public EmployeeData add(EmployeeData employeeData) {
		return dataRepository.save(employeeData);
	}
	
	public List<EmployeeData> get(){
		return dataRepository.findAll();
	}
}
