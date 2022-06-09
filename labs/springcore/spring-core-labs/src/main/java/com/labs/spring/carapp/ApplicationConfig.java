package com.labs.spring.carapp;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {

	@Bean(autowire = Autowire.BY_TYPE, initMethod = "init", destroyMethod = "destroy")
	@Lazy(value=true)
	//@Scope("Singleton")
	public Car bmw() {
		//construction injection
		//return new Car("xt", "BMW" , "White" , petrol());
		//return new Car();
		//return new Car("xt", "BMW" , "White");
		
		//setter injection
		//Car bmw = new Car("xt", "BMW", "White");
		Car bmw = new Car();
		bmw.setColor("White");
		bmw.setManufacutrer("BMW");
		bmw.setModel("xt");
		//bmw.setEngine(electric());
		return bmw;
	}
	

	@Bean
	public Car nexon() {
		//setter injection
		Car nexon = new Car("dt", "Tata", "Red");
		nexon.setEngine(petrol());
		return nexon;
	}
	
	@Bean
	public Engine petrol() {
		return new Engine("petrol" , 2000);
	}
	
	@Bean(autowireCandidate = false)
	public Engine diesel() {
		return new Engine("diesel" , 4000);
	}
	@Bean(autowireCandidate = false)
	//@Primary
	public Engine electric() {
		return new Engine("electric" , 6000);
	}
	@Bean(autowireCandidate = false)
	public Engine cng() {
		return new Engine("cng" , 8000);
	}
}
