package com.lowes.bankingapp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class BankingAppZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppZuulApplication.class, args);
	}

}
