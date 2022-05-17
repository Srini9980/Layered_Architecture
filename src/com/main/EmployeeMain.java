package com.main;
import com.bean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Srinivas", 45000);
		int empId = emp1.getEmpId();
		String empName = emp1.getEmpName();
		double empSalary = emp1.getEmpSalary();
		
		System.out.println("Employee Details :");
		System.out.println("EmployeeId = " + emp1.getEmpId());
		System.out.println("Employee Name = " + emp1.getEmpName());
		System.out.println("Employee Salary = " + emp1.getEmpSalary());
	}

}
