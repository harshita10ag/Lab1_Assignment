/**
 * Get employee details from user.
 */
package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	Employee getEmployeeDetails();

	String findInsuranceScheme(Employee emp);

	void displayDetails(Employee emp);

}
