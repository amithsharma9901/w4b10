package com.ey;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.ey.dto.CustomerDTO;
import com.ey.dto.CustomerType;
import com.ey.exception.InfyBankException;
import com.ey.service.CustomerServiceImpl;

@SpringBootApplication
public class DemoSpringDeleteReadApplication implements CommandLineRunner {

	
	@Autowired
	CustomerServiceImpl customerService;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDeleteReadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	 addCustomer();
		updateCustomer();
	//	getCustomer();
	
	//	deleteCustomer();
	//	getallCustomers();
		
	}

	public void getCustomer() throws InfyBankException {
		try {
			CustomerDTO customerDTO = customerService.getCustomer(2);
		//	System.out.println(customerDTO);
		System.out.println(customerDTO);
		} catch (Exception e) {

				}
	}
	
	public void  getallCustomers() throws InfyBankException{
		List<CustomerDTO> customerDTOlist = customerService.getallCustomers();
		 customerDTOlist.stream().forEach(c->System.out.println(c));
		
	}

	public void addCustomer() {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerId(2);
		customerDTO.setEmailId("UstUSer2@ust.com");
		customerDTO.setName("USer2");
		customerDTO.setDateOfBirth(LocalDate.of(1990, 6, 12));
		customerDTO.setCustomerType(CustomerType.GOLD);

		try {
			customerService.addCustomer(customerDTO);
			
		} catch (Exception e) {

			}
	}

	public void updateCustomer() {
		try {
			customerService.updateCustomer(2, "USTuser2025@ust.com");
		
		} catch (Exception e) {

		}
	}

	public void deleteCustomer() {
		try {
			customerService.deleteCustomer(1);
		} catch (Exception e) {
			
		}
	}
}
