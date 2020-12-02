package com.cg.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee=context.getBean(Employee.class);
		employee.setEmployeeId(101);
		employee.setEmployeeName("Harshita");
		employee.setAge(20);
		employee.setBusinessUnit("Pes-BU");
		employee.setSalary(40000);
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println("Employee Id:"+employee.getEmployeeId());
		System.out.println("Employee Name:"+employee.getEmployeeName());
		System.out.println("Employee Salary :"+employee.getSalary());
        System.out.println("Employee BU :"+employee.getBusinessUnit());
        System.out.println("Employee Age :"+employee.getAge());
	}

}
