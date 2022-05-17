package com.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dao.CustomerImpl;
import com.model.Customer;
import com.service.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerImpl();
		List<Customer> listOfCust = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		int noOfCust = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i < noOfCust; i++) {
			System.out.println("Enter id");
			int id = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter name");
			String name = scanner.nextLine();
			System.out.println("Enter phone");
			long phone = Long.parseLong(scanner.nextLine());
			System.out.println("Enter Email");
			String email = scanner.nextLine();
			
			Customer customer = new Customer(id, name, phone, email);
			listOfCust.add(customer);
		}
		
		service.addCustomer(listOfCust);
		List<Customer> viewListOfCustomer = service.viewCustomer();
		for(Customer custObj : viewListOfCustomer)  {
			System.out.println(custObj.getCustId() + " " + custObj.getCustName() + " " + custObj.getCustPhone() + " " + custObj.getEmail());
			
		}
		System.out.println("After sorting");
		
		List<Customer> sortedList = service.sortCustomerById();
		Iterator<Customer> itr = sortedList.iterator();
		while(itr.hasNext()) {
			Customer custObj = itr.next();
			System.out.println(custObj.getCustId() + " " + custObj.getCustName() + " " + custObj.getCustPhone() + " " + custObj.getEmail());
			
		}
		System.out.println("Going to Remove customer by id...");
		System.out.println("Enter customer Id");
		
		int removeId = Integer.parseInt(scanner.nextLine());
		Customer obj = service.removeCustomer(removeId);
		
		if(obj != null)  {
			System.out.println(obj.getCustName() + " " + obj.getCustPhone());
			
		}
		else {
			System.out.println("Customer id not found");
		}
		System.out.println("Going to update Customer phone by id...");
		System.out.println("Enter customer id");
		int updateId = Integer.parseInt(scanner.nextLine());
		Customer obj2 = service.updateCustomer(updateId);
		
		if(obj2 != null) {
			System.out.println(obj2.getCustName()+ " " + obj2.getCustPhone() + " " + obj2.getEmail());
		}
		else {
			System.out.println("Customer id not found");
		}
		

	}

}
