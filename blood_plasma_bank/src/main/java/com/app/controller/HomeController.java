package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("in constr of "+getClass().getName());
	}
	
	@GetMapping("/")
	public String provideHomePage() {
		return "/index";
	}
	@GetMapping("/AboutUs")
	public String provideAboutHomePage() {
		return "/AboutUs";
	}
	@GetMapping("/ContactUs")
	public String provideContactHomePage() {
		return "/ContactUs";
	}
	
}
