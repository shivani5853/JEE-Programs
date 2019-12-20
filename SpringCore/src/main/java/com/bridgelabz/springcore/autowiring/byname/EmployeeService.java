package com.bridgelabz.springcore.autowiring.byname;

public class EmployeeService {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService(Employee employee) {
		System.out.println("Autowired with constructor");
		this.employee = employee;
	}

	public EmployeeService() {
		System.out.println("Autowired with default constructor");
	}
}
