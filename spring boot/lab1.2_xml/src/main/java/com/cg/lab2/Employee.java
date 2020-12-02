package com.cg.lab2;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	private int age;
	
	public Employee() {
		
	}
	
	
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param salary
	 * @param businessUnit
	 * @param age
	 */
	public Employee(int employeeId, String employeeName, double salary, SBU businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the businessUnit
	 */
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	/**
	 * @param businessUnit the businessUnit to set
	 */
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	/**
	 * displaying detail of an Employee
	 */
	public void getSbuDetails() {
		System.out.println("Employee details");
		System.out.println("-----------------------");
		System.out.println("Employee [empage="+getAge()+", empId="+getEmployeeId()+", empName="+getEmployeeName()+", empSalary="+getSalary());
		businessUnit.getBusineesUnitDetails();	
	}

}
