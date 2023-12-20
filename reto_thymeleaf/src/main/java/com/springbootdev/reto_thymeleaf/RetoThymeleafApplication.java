package com.springbootdev.reto_thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RetoThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoThymeleafApplication.class, args);
	}

}
