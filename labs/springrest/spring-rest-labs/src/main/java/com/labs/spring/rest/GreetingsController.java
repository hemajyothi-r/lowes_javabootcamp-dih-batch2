package com.labs.spring.rest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	Logger logger = LoggerFactory.getLogger(GreetingsController.class);
	
	// http://localhost:8080/spring-rest-labs/greetings

	// @RequestMapping(path = "/greetings", method = RequestMethod.GET, consumes =
	// {MediaType.APPLICATION_JSON_VALUE}, produces =
	// {MediaType.APPLICATION_JSON_VALUE})
	// @RequestMapping(path = "/greetings", method = RequestMethod.GET, produces =
	// {MediaType.TEXT_PLAIN_VALUE})
	@RequestMapping(path = "/greetings", method = RequestMethod.GET, produces = { MediaType.TEXT_HTML_VALUE })
	//
	// @GetMapping("/greetings")
	public String greetings() {
		return "Hello Spring REST!!!";
	}

	@RequestMapping(value = { "/", "/greetings" }, method = RequestMethod.GET)
	public String greeting() {
		return "Hello Spring REST!!! :)";
	}

	@RequestMapping(value = "/greetings", method = RequestMethod.GET, params = { "msg" })
	public String getGreeting(@RequestParam(required = false, defaultValue = "Hello") String msg) {
		return "Hello Spring REST!!! - " + msg;
	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.GET, params = { "msg1", "msg2" })
//	public String getGreetingMsgs(@RequestParam(required = true, defaultValue = "Hello") String msg1,
//			@RequestParam(name = "msg2") String msg2) {
//		return "Hello Spring REST!!! - " + msg1 + msg2;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.GET, headers = { "message" })
//	public String getGreetingWithHeader(@RequestHeader(required = false, defaultValue = "TestHeaders") String message) {
//		return "Hello Spring REST!!! - " + message;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = { "text/plain" })
//	public String postGreetingMap(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST)
//	public String postGreetingAll(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - ALL--" + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = { MediaType.TEXT_PLAIN_VALUE })
//	public  String postGreetingText(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - Text " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = {
//			MediaType.TEXT_PLAIN_VALUE }, produces = { MediaType.TEXT_PLAIN_VALUE })
//	public  String postGreetingText2(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - Text Text " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = {
//			MediaType.TEXT_PLAIN_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
//	public String postGreetingTextJson(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - Text JSON " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
//	public  String postGreetingJson(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - JSON " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, produces = { "application/xml;q=0.9",
//			"application/json;q=0.8" })
//	public  String postGreetingPriority(@RequestBody String greeting) {
//		return "Hello Spring REST!!! - priority over JSON/XML " + greeting;
//	}
//
//	@RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes = { "application/xml",
//			"application/json" }, produces = { "application/xml", "application/json" })
//	public Greetings postGreetingObject(@RequestBody Greetings greeting) {
//		greeting.setMessage(greeting.getMessage() + " - POST object mapping example");
//		return greeting;
//	}
	
	@RequestMapping(value = "/greetings/collection", method = RequestMethod.POST)
	public Map<String, String> postGreetingMap(@RequestBody Map<String, String> greeting) {
		logger.info("greetings collections : " + greeting);
		greeting.put("updated", "POST collection mapping example");
		return greeting;
	}
	
	
	

}
