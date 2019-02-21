package com.study.springframework.mvc.medium;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("medium")
public class MediumPagesController {

	@Value("#{countries}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/")
	public String index() {
		return "medium/index";
	}
	
	@RequestMapping("/showForm")
	public String index(Model model) {
		
		model.addAttribute("people", new People());
		model.addAttribute("countryOptions", countryOptions);
		
		return "medium/formModel";
	}
	
	@RequestMapping("/processFormModel")
	public String processFormModel(@ModelAttribute("people") People people) {
				
		return "medium/finallyForm";
	}
	
}
