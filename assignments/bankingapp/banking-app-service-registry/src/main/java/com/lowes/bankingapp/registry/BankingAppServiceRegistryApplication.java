package com.lowes.bankingapp.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankingAppServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppServiceRegistryApplication.class, args);
	}

}
