package com.ust.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ust.Engine;
import com.ust.components.Customer;

@Configuration

public class SpringConfig{
	
	@Bean 
	public Customer customer() {
		return new Customer();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
}

