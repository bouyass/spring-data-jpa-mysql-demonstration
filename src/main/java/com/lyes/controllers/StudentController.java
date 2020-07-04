package com.lyes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lyes.entities.Student;
import com.lyes.services.StudentRepo;

@Controller
@RequestMapping(path="/student")
public class StudentController {
	
	@Autowired
	private StudentRepo sr;
	
	@PostMapping(path="/add")
	public @ResponseBody String addNewStudent(@RequestParam String name,@RequestParam int age) {
		Student student = new Student(name,age);
		sr.save(student);
		return "saved";
	}
	
	public @ResponseBody Iterable<Student> getAllStudents(){
		return sr.findAll();
	}
	
}
