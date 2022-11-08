package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);
		
	/*	ApplicationContext context = new ClassPathXmlApplicationContext("springIOC.xml");
	 	ISort obj = (ISort) context.getBean("bubbleSort");
	 	obj.sorting();
		System.out.println("Ok got it!")  */

		
		
	/*	ApplicationContext context = new ClassPathXmlApplicationContext("springIOC.xml");
		Tyre obj = (Tyre) context.getBean("tyre");
		obj.display();
		System.out.println("Ok got it!");   */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springIOC.xml");
		CollectionDemo obj = (CollectionDemo) context.getBean("collection");
		//obj.getAddressList();
		System.out.println(obj.getAddressList());
		System.out.println(obj.getAddressSet());
		System.out.println(obj.getAddressMap());
	}

}
