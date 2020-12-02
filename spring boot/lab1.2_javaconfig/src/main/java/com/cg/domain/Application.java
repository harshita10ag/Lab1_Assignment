package com.cg.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);    
        Employee employee = context.getBean(Employee.class);
        employee.setEmployeeId(12345);
        employee.setEmployeeName("Harriet");
        employee.setSalary(40000.0);
        SBU sbu=context.getBean(SBU.class);
        sbu.setSbuCode("PES-BU");
        sbu.setSbuName("Product Engineering Services");
        sbu.setSbuHead("Kiran Rao");
        System.out.println();
        System.out.println(employee);
	}

}
