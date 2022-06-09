package com.labs.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		//System.out.println("Hello Spring");

//		//Greetings greetings = new Greetings();
//		Greetings greetings = new Greetings("Welcome to Spring Framework!!");
//		//System.out.println(greetings.getMessage());
//		System.out.println("Hello Spring!!!");
//		System.out.println(greetings.getMessage());
//		
//		Greetings greetings1 = new Greetings("Welcome to Spring Training!!");
//			System.out.println("Hello Spring!!!");
//		System.out.println(greetings1.getMessage());
//		
//		Greetings greetings2 = new Greetings("Welcome to Spring!!");
//		
//		System.out.println("Hello Spring!!!");
//		System.out.println(greetings2.getMessage());
		
		
		//STEP 1 : create instance of IoC container
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("beans-config.xml");
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("\\src\\beans-config.xml");
		
		System.out.println(ctx);
		System.out.println("no of beans: " + ctx.getBeanDefinitionCount());
		
		//Step2 : Access beans from container
		Greetings greetings = ctx.getBean("greetings", Greetings.class);
		System.out.println(greetings.getMessage());
		
		Greetings greetings1 = ctx.getBean("greetings1", Greetings.class);
		System.out.println(greetings1.getMessage());
		
		Greetings greetings2 = ctx.getBean("greetings2", Greetings.class);
		System.out.println(greetings2.getMessage());
		
	}

}
