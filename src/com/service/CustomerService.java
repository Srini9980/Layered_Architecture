package com.service;

import java.util.List;

import com.model.Customer;

public interface CustomerService {
	
	public void addCustomer(List<Customer> listOfCustomer);
	public List<Customer> viewCustomer();
	public Customer removeCustomer(int custId);
	public Customer serachCustomer(int customerId);
	public List<Customer> sortCustomerById();
	public Customer updateCustomer(int custId);

}
