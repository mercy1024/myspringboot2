package com.mercy.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mercy
 * @version 1.0.0
 */
@RestController
@Configuration
@ComponentScan
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring Boot 2!";
	}
}
