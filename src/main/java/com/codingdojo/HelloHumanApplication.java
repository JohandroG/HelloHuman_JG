package com.codingdojo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@RequestParam(value = "name",required=false) String name, @RequestParam(value = "last_name",required=false) String last_name) {
		if(name == null) {
			return "<h1>Hello human!</h1><h2>Welcome to SpringBoot</h2>"; 
		 }
		
		if(last_name == null) {
	        return "<h1>Hello " + name + "!</h1><h2>Welcome to SpringBoot</h2>"+"<h3><a href=\"/\">Go Back</a></h3>"; 
		 }
		else {
	        return "<h1>Hello " + name +" "+ last_name + "!</h1><h2>Welcome to SpringBoot</h2>"+"<h3><a href=\"/\">Go Back</a></h3>"; 
		 }
	}
}
