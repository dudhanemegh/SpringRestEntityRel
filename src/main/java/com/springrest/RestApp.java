package com.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class RestApp {
	public static void main(String[] args) {
		SpringApplication.run(RestApp.class);
		
	}

}
