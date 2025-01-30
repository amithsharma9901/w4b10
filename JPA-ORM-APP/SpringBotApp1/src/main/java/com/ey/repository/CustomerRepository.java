package com.ey.repository;

import java.util.List;

import com.ey.dto.CustomerDTO;

public interface CustomerRepository {

	public CustomerDTO getCustomer(Integer customerId);
	
	public  List<CustomerDTO>  getAllCustomers();

	public void addCustomer(CustomerDTO customerDTO);

	public Integer updateCustomer(Integer customerId, String emailId);

	public Integer deleteCustomer(Integer customerId);
}
