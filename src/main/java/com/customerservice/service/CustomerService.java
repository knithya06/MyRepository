package com.customerservice.service;

import java.util.List;

import com.customerservice.entity.Customer;
import com.customerservice.exceptions.CustomerAlreadyExistsException;
import com.customerservice.exceptions.CustomerNotFoundException;

public interface CustomerService {
	
	public List<Customer> getAllCustomer();

	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException;

	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;

	public void deleteCustomerById(Integer customerId) throws CustomerNotFoundException;
}


