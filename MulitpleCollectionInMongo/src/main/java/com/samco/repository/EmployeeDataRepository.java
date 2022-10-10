package com.samco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.model.EmployeeData;

@Repository
public interface EmployeeDataRepository extends MongoRepository<EmployeeData, Integer>{

}
