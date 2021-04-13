package com.bitacademy.myportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/main")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		
//		mav.addObject("message", "This portal is " + name + "'s portal");
		mav.setViewName("/WEB-INF/views/home.jsp");
		
		return mav;	
	}
}
