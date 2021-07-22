package com.yhdc.backendapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("")
	public String home() {
		return "/home";
	}

	@RequestMapping("/about")
	public String about() {
		return "/home/about";
	}

	@GetMapping("/contact")
	public String contact() {
		return "/home/contact";
	}
	
	@GetMapping("/auth/join")
	public String join() {
		return "/home/join";
	}
	
	@GetMapping("/auth/login")
	public String login() {
		return "/home/login";
	}
	
}
