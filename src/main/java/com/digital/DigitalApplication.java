package com.digital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.digital.digitalservicos.repositories.UserRepository;

@SpringBootApplication
public class DigitalApplication {
@Autowired
private UserRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DigitalApplication.class, args);
		
	}

}
