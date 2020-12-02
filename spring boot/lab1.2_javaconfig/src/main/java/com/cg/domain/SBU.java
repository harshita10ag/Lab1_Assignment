package com.cg.domain;

public class SBU {
	private String sbuCode;
	private String sbuName;
	private String sbuHead;
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
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	

}
