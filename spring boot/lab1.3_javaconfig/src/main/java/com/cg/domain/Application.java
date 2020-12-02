package com.cg.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);    
        SBU sbu=(SBU)context.getBean(SBU.class);
        System.out.println();
        System.out.println(sbu);
		
	}

}
