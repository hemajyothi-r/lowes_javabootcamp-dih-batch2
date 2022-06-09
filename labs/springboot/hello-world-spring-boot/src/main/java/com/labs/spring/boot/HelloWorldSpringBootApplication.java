package com.labs.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan, @Configuration, @EnableAutoConfiguration
public class HelloWorldSpringBootApplication implements CommandLineRunner{

	@Autowired
	ApplicationContext context;
	
	Logger logger = LoggerFactory.getLogger(HelloWorldSpringBootApplication.class);
	
//	@Autowired
//	public HelloWorldSpringBootApplication(ApplicationContext context) {
//		this.context=context;
//	}
	
	public static void main(String[] args) {
		System.out.println("Hello SPring boot before launch");
		SpringApplication.run(HelloWorldSpringBootApplication.class, args);
		System.out.println("Hello SPring boot after launch");
//		GreetingsService service = new GreetingsService();
//		service.showGreetings();
		//System.out.println(context);
		
//		HelloWorldSpringBootApplication hello = new HelloWorldSpringBootApplication();
//		hello.showGreetings();
		
	}
//	private void showGreetings()
//	{
//		System.out.println(context);
//	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Hello SPring boot during the launch");
		System.out.println("Context : " + context);
		System.out.println("No. of beans : " + context.getBeanDefinitionCount());
//		for(String beanName: context.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}
		
		Greetings greetings = context.getBean("greetings" , Greetings.class);
		System.out.println(greetings.getMessage());
				
		logger.info(greetings.getMessage());
	}
	
//	@Bean
//	public Greetings greetings() {
//		return new Greetings();
//	}
	
}
