package com.cg.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new FileSystemXmlApplicationContext("beans.xml");
    	Employee employee=context.getBean("employee",Employee.class);
    	employee.display();
    }
}
