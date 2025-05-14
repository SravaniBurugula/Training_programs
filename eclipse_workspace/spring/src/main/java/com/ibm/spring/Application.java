package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class Application
{
	public static void main( String[] args )
	{
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
	    textEditor.spellChecker();
	    
//	    JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
//	    
//	    jc.getAddressList();
//	    jc.getAddressMap();
//	    jc.getAddressProp();
//	    jc.getAddressSet();
//	 
	    
		System.out.println("End");
	}
}