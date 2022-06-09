package com.labs.spring.carapp;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		// AbstractApplicationContext ctx = new AnnotationConfigApplicationContext();

		System.out.println("No of beans: " + ctx.getBeanDefinitionCount());

		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanName);

//		Car bmw = ctx.getBean("bmw", Car.class);
//		System.out.println(bmw.getModel() + " " + bmw.getColor() + " " + bmw.getManufacutrer() + " " + bmw.getEngine());
//		
//		Car nexon = ctx.getBean("nexon", Car.class);
//		System.out.println(nexon.getModel() + " " + nexon.getColor() + " " + nexon.getManufacutrer() + " " + nexon.getEngine());
//		

			if (Arrays.asList("bmw", "nexon").contains(beanName)) {
				Car car = ctx.getBean(beanName, Car.class);
				System.out.println(
						car.getModel() + " " + car.getColor() + " " + car.getManufacutrer() + " " + car.getEngine());
//			
			}
		}
		// shut down context
		ctx.registerShutdownHook();

	}

}
