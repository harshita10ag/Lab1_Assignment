package com.cg.lab2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.cg.lab2.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	FileSystemResource resource=new FileSystemResource("beans.xml");
    	BeanFactory beanFactory=new XmlBeanFactory(resource);
    	Employee employee=(Employee)beanFactory.getBean(Employee.class);
    	employee.getSbuDetails();
    }
}
