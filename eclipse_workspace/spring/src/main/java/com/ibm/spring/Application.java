package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class Application
{
	public static void main( String[] args )
	{
		//AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TextEditor textEditor = (TextEditor)context.getBean(TextEditor.class);
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