package com.lyes;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lyes.controllers.StudentController;
import com.lyes.entities.Student;



@SpringBootApplication
public class SpringDataJpaMysqlApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaMysqlApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMysqlApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(StudentController sc) {
		return (args) -> {
			sc.addNewStudent("lyes makhloufi", 26);
			sc.addNewStudent("karim makhloufi", 20);
			
			for (Student customer : sc.getAllStudents()) {
		        log.info(customer.toString());
		    }
			
		};
	}


}
