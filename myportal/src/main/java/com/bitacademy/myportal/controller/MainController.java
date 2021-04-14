package com.bitacademy.myportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({"/", "/main"})
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView();
		
//		mav.addObject("message", "This portal is " + name + "'s portal");
//		prefix: /WEB-INF/views/, suffix: .jsp
		mav.setViewName("home");
//		전달된 ViewName을 기반으로 ViewResolver에게 실제 뷰 위치를 질의
		
		return mav;	
	}
}
