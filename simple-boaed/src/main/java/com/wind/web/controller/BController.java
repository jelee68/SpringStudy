package com.wind.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.web.service.BContentService;
import com.wind.web.service.BDeleteService;
import com.wind.web.service.BListService;
import com.wind.web.service.BModifyService;
import com.wind.web.service.BReplyService;
import com.wind.web.service.BReplyViewService;
import com.wind.web.service.BService;
import com.wind.web.service.BWriteService;

@Controller
public class BController {
	
	BService service = null;
	
	@RequestMapping("/list")
	public String list(Model model) { 
		service = new BListService();
		service.execute(model);
		return "list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest httpServletRequest,Model model) {	
		model.addAttribute("reuest", httpServletRequest);
		
		service = new BContentService();
		service.execute(model);
		return "content_view";
	}	
}
