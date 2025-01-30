package com.ey.service;

import java.util.List;

import com.ey.dto.CustomerDTO;
import com.ey.exception.InfyBankException;


public interface CustomerService {
	//public  List<CustomerDTO>  getAllCustomers();
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;

	public void addCustomer(CustomerDTO customerDTO) throws InfyBankException;

	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException;

	public void deleteCustomer(Integer customerId) throws InfyBankException;
	
	public List<CustomerDTO> getallCustomers() throws InfyBankException;
}
