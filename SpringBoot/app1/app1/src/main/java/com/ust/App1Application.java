package com.ust;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //@Configuration , @ComponentScan @EnableAutoConfiguration
public class App1Application implements CommandLineRunner{//SpringBoot console application

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
	
	public void run(String... args) {
		System.out.println(" Welcome to Spring boot console application");
	}
	

}
