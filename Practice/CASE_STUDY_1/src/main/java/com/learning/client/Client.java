package com.learning.client;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.entity.Stu;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		/*SampleEntity se = (SampleEntity)appContext.getBean("se");
		System.out.println(se);*/
		Stu e = (Stu)appContext.getBean("student");
		/*Emp e = (Emp)appContext.getBean("employee");*/
		e.calctotal();
		
		
		System.out.println(e);
		
		/*Address address = (Address)appContext.getBean("address");
		
		System.out.println(address);*/
		System.out.println("End of program");
	}
}