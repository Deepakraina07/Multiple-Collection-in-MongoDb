package com.samco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.CompareEmployee;
import com.samco.repository.CompareRepository;

@Service
public class CompareService {

	@Autowired
	CompareRepository compareRepository;
	
	public CompareEmployee add(CompareEmployee compareEmployee) {
		return compareRepository.save(compareEmployee);
	}
	
	public List<CompareEmployee> get(CompareEmployee compareEmployee){
		return compareRepository.findAll();
	}
}
