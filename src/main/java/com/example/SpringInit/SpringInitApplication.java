package com.example.SpringInit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableJpaRepositories
@EnableTransactionManagement
public class SpringInitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitApplication.class, args);
	}

}
