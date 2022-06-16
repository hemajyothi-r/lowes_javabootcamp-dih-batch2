package com.labs.spring.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	Logger logger = LoggerFactory.getLogger(GreetingsController.class);
	@GetMapping("/greetings")
	public String greetings() {
		logger.trace("TRACE-LOg");
		logger.debug("DEBUG-LOg");
		logger.info("INFO-log");
		logger.error("Error-log");
		logger.warn("WARN-Log");
		return "Welcome to Spring Boot Web App: added Dev tools--testing again ";
	}
}
