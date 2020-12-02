package com.cg.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;



public class App 
{
    public static void main( String[] args )
    {
    	FileSystemResource resource=new FileSystemResource("beans.xml");
    	BeanFactory beanFactory=new XmlBeanFactory(resource);
    	Employee employee=(Employee)beanFactory.getBean(Employee.class);
    	employee.display();
    }
}
