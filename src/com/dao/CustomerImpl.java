package com.dao;

import java.util.Collections;
import java.util.List;

import com.model.Customer;
import com.service.CustomerService;

public class CustomerImpl implements CustomerService {
	
	private List<Customer> listCustomer;

	public void addCustomer(List<Customer> listOfCustomer) {
		this.listCustomer = listOfCustomer;
		
	}

	public List<Customer> viewCustomer() {
		
		return listCustomer;
	}

	public Customer removeCustomer(int custId) {
		
		return null;
	}

	public Customer serachCustomer(int customerId) {
		
		return null;
	}

	public List<Customer> sortCustomerById() {
		Collections.sort(listCustomer);
		return listCustomer;
	}

	public Customer updateCustomer(int custId) {
		
		return null;
	}
	

}
