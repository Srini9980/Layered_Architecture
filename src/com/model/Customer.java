package com.model;

public class Customer implements Comparable<Customer> {
	
	private int custId = 10;
	private String custName = "ABC";
	private long custPhone = 22334455;
	private String email = "abc@gamil.com";
	
	public Customer(int custId, String custName, long custPhone, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhone = custPhone;
		this.email = email;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Customer cust) {
		if(cust.custId < this.custId) {
			return 1;
		}
		return 1;
	}
	
	
	
	

}
