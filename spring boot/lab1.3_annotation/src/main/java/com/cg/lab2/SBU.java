package com.cg.lab2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	
	@Value("PES-BU")
	private String sbuCode;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;
	@Autowired
	private List<Employee> empList;
	
	public SBU() {
		
	}
	
	/**
	 * @return the empList
	 */
	public List<Employee> getEmpList() {
		return empList;
	}

	/**
	 * @param empList the empList to set
	 */
	@Autowired
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	
	/**
	 * @param sbuCode
	 * @param sbuName
	 * @param sbuHead
	 * @param empList
	 */
	
	public SBU(String sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	/**
	 * @return the sbuId
	 */
	public String getSbuCode() {
		return sbuCode;
	}
	/**
	 * @param sbuId the sbuId to set
	 */
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	/**
	 * @return the sbuName
	 */
	public String getSbuName() {
		return sbuName;
	}
	/**
	 * @param sbuName the sbuName to set
	 */
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	/**
	 * @return the sbuHead
	 */
	public String getSbuHead() {
		return sbuHead;
	}
	/**
	 * @param sbuHead the sbuHead to set
	 */
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public void getBusineesUnitDetails() {
		System.out.println("SBU Details");
		System.out.println("----------------------");
		System.out.println("SBU [sbuCode="+getSbuCode()+", sbuhead="+getSbuHead()+", sbuName="+getSbuName()+"]]");
		 System.out.println("Employee details:---------------");
//		
		 List<Employee> employees = getEmpList();
	        for (Employee employee : employees) {
	            System.out.print("[Employee [Employee Id : " + employee.getEmployeeId()+" Employee Name : " + employee.getEmployeeName()+" Employee salary :"+employee.getSalary()+"] ");
//	            
	        }
	}
}
