package com.wind.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.service.BContentService;
import com.wind.web.service.BService;

@Controller
public class BController {

	BService service = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		service = new BContentService();
		service.execute(model);
		return "list";
	}
	
}
