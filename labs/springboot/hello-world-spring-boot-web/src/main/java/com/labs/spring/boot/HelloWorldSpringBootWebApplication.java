package com.labs.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class HelloWorldSpringBootWebApplication {

	public static void main(String[] args) {
		
		WebApplicationContext webctx;
		
		SpringApplication.run(HelloWorldSpringBootWebApplication.class, args);
	}

}
