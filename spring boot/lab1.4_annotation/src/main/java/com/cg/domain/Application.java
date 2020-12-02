package com.cg.domain;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class Application {
	  
	  @Autowired
	  private  List<Employee> emp;
	  

	/**
	 * @return the emp
	 */
	public List<Employee> getEmp() {
		return emp;
	}


	/**
	 * @param emp the emp to set
	 */
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	public  Employee getEmplyeeById(int empId)
	{  
		for (Employee employee : emp) {
		if(employee.getEmpId()==empId)
			{
		    	return employee;
			}
			
		}
		return null;
	} 


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print( "EmployeeID:" );
        int id=sc.nextInt();
        ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
        Application app=(Application)context.getBean("application");
        Employee emp=app.getEmplyeeById(id);
        System.out.println(emp);
	}

}
