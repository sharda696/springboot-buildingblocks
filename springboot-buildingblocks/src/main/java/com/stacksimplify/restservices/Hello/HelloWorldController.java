package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
	//simple method
	//URI - /helloworld
//get method
	
//	@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "Hello World1";
		
	}
	
	//@GetMapping("/helloworld-bean")
	@RequestMapping(method=RequestMethod.GET,path="/helloworld-bean1")
	public UserDetails helloWorldBean() {
		return new UserDetails("Sharda","reddy","pune-wakad");
	}

}
