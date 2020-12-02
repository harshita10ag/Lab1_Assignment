package com.cg.lab2;

import java.util.List;

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
    	SBU sbu=(SBU)beanFactory.getBean(SBU.class);
    	sbu.getBusineesUnitDetails();
    }
}
