package com.cg.lab2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	
	public SBU() {
		
	}
	public SBU(String sbuCode, String sbuName, String sbuHead) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
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
		System.out.println("sbu details = SBU [sbuCode="+getSbuCode()+", sbuhead="+getSbuHead()+", sbuName="+getSbuName()+"]]");
	}

}
