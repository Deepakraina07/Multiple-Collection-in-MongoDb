package com.samco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.model.CompareEmployee;

@Repository
public interface CompareRepository extends MongoRepository<CompareEmployee, Integer>{

}
