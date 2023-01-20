package com.spring.hazaremlak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.spring.hazaremlak.Filter.RealEstatesSpecificationGenerator;
import com.spring.hazaremlak.model.RealEstatesFilter;
import com.spring.hazaremlak.respository.RealEstatesRepository;
   
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
//@EntityScan(basePackages = "com.spring.hazaremlak") 

public class HazaremlakApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazaremlakApplication.class, args);
	}

	
	}


