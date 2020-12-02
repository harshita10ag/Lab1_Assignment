package com.cg.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sbu")
public class SBU {
	private String sbuCode;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;
	@Value("#{empList}")
	List<Employee> empList;
	/**
	 * @return the sbuCode
	 */
	public String getSbuCode() {
		return sbuCode;
	}
	/**
	 * @param sbuCode the sbuCode to set
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
	/**
	 * @return the empList
	 */
	public List<Employee> getEmpList() {
		return empList;
	}
	/**
	 * @param empList the empList to set
	 */
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}
	

}
