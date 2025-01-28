package net.javaguides.springmvc.helloworld.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springmvc.helloworld.model.HelloWorld;


@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String handler(Model model) {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Welcome to UST SpringMVC session");
		helloWorld.setDateTime(LocalDateTime.now().plusHours(1).toString());
		model.addAttribute("helloWorld", helloWorld);
		return "helloworld";
	}
	
	
	@RequestMapping("/home")
	public String message() {
		return "home";
	}
}