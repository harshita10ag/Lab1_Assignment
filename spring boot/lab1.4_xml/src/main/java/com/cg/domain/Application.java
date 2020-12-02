package com.cg.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
@SpringBootApplication
public class Application {

	private static List<Employee> emp;
	public static Employee getEmplyeeById(int empId)
	{    
		emp=new ArrayList<>();
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	        emp.add((Employee)ctx.getBean("employee"));

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
    	
        System.out.print( "EmployeeId:" );
        int id=sc.nextInt();
        Employee employ=getEmplyeeById(id);
        System.out.println(employ);
	
	}

}
