package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ey.dto.CustomerDTO;
import com.ey.exception.InfyBankException;
import com.ey.repository.CustomerRepository;

@Service(value = "customerService")
@Transactional //insert, update,delete , declarative tx management
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException {

		CustomerDTO customerDTO = customerRepository.getCustomer(customerId);

		if (customerDTO == null) {
			throw new InfyBankException("Service.CUSTOMER_UNAVAILABLE");
		}

		return customerDTO;
	}

	@Override
	public List<CustomerDTO> getallCustomers() throws InfyBankException{
		List<CustomerDTO> customerDTOlist = customerRepository.getAllCustomers();
		return customerDTOlist;
	}
	@Override
	
	public void addCustomer(CustomerDTO customerDTO) throws InfyBankException {

		if (customerRepository.getCustomer(customerDTO.getCustomerId()) != null) {
			throw new InfyBankException("Service.CUSTOMER_ALREADY_EXISTS");
		}

		customerRepository.addCustomer(customerDTO);

	}

	@Override
	
	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException {
		CustomerDTO customerDTO = customerRepository.getCustomer(customerId);

		if (customerDTO == null) {
			throw new InfyBankException("Service.CUSTOMER_UNAVAILABLE");
		}
		customerRepository.updateCustomer(customerId, emailId);
	}

	@Override
	public void deleteCustomer(Integer customerId) throws InfyBankException {
		CustomerDTO customerDTO = customerRepository.getCustomer(customerId);

		if (customerDTO == null) {
			throw new InfyBankException("Service.CUSTOMER_UNAVAILABLE");
		}
		customerRepository.deleteCustomer(customerId);
	}
}
