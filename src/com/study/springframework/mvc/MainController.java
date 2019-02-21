package com.study.springframework.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showMainPage() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String showMainPageHome() {
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
	
	@RequestMapping("/showFormModel")
	public String showFormModel() {
		return "formModel";
	}
	
	@RequestMapping("/processFormModel")
	public String processFormModel(@RequestParam("name") String name, Model model) {
				
		String nameRevertArray = "";
		
		for (int i = (name.toCharArray().length - 1); i >= 0; i-- ) {
			nameRevertArray += name.toCharArray()[i];
		}
		
		model.addAttribute("name", nameRevertArray);
		
		return "helloWorldWithModel";
	}
}
