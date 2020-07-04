package com.lyes.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lyes.entities.Student;

public interface StudentRepo extends CrudRepository<Student,Long>{
	

}
