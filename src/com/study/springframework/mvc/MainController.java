package com.study.springframework.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showMainPage() {
		return "index";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
}
