package com.samco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.model.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepository extends MongoRepository<EmployeeDetails, Integer>{

}
