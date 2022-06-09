package com.labs.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class GreetingsService {

	@Autowired
	ApplicationContext context;
	
//	public GreetingsService(ApplicationContext context) {
//		this.context=context;
//	}
	
	public GreetingsService() {
		
	}
	
	public void showGreetings() {
		Greetings greetings = context.getBean("greetings", Greetings.class );
		greetings.setMessage("Hello spring boot service");
		System.out.println(greetings.getMessage());		
	}
	
}
