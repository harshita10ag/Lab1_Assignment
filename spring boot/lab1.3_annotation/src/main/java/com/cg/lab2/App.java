package com.cg.lab2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
    	SBU sbu=context.getBean(SBU.class);
    	sbu.getBusineesUnitDetails();
    }
}
