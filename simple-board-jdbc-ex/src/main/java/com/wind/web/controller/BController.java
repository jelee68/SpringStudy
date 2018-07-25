package com.wind.web.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.BDao;
import com.wind.web.dto.BDto;

@Controller
public class BController {
	
	BDao dao;
	
	@Autowired
	public void setDao(BDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/list")
	public String list(Model model) { 
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		return "list";
	}
	
	@RequestMapping("/view")
	public String content_view(HttpServletRequest request,Model model) {	
		BDto dto = dao.contentView(request.getParameter("mId"));
		model.addAttribute("view", dto);
		return "view";
	}	

	@RequestMapping("/write")
	public String write(HttpServletRequest request,Model model) {
		dao.write(request.getParameter("mName"),request.getParameter("mContent"));
		return "redirect:list";	
	}
	
	@RequestMapping("/write_view")
	public String write_view() {
		return "write_view";	
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		dao.delete(request.getParameter("mId"));
		return "redirect:list";	
	}

}
