package com.study.springframework.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicPageController {

	@RequestMapping("/")
	public String showMainPage() {
		return "basic/index";
	}
	
	@RequestMapping("/home")
	public String showMainPageHome() {
		return "basic/index";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "basic/form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "basic/helloWorld";
	}
	
	@RequestMapping("/showFormModel")
	public String showFormModel() {
		return "basic/formModel";
	}
	
	@RequestMapping("/processFormModel")
	public String processFormModel(@RequestParam("name") String name, Model model) {
				
		String nameRevertArray = "";
		
		for (int i = (name.toCharArray().length - 1); i >= 0; i-- ) {
			nameRevertArray += name.toCharArray()[i];
		}
		
		model.addAttribute("name", nameRevertArray);
		
		return "basic/helloWorldWithModel";
	}
}
