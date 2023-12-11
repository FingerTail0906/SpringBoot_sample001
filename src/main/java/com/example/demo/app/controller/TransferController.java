package com.example.demo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.DisplayDataForm;

@Controller
public class TransferController {
	
	@GetMapping("/from")
    public String getFrom(ModelMap modelMap) {
		return "view/from";
	}
	
	@GetMapping("/to")
    public String geTom(ModelMap modelMap, @ModelAttribute("DisplayDataForm") DisplayDataForm DisplayDataForm) {
		modelMap.addAttribute("DisplayDataForm", DisplayDataForm);
		return "view/to";
	}
}
