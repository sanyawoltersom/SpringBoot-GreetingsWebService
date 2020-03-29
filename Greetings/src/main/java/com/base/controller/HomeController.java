package com.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() 
	{
		System.out.println("Loading Homepage!");
		
		return "home";
	}
	
	/*
	public String helloUser(@RequestParam("name") String myName, HttpSession session)
	{		
		session.setAttribute("name", myName);		
		System.out.println("Loading Hello User!");
		
		return "hellouser";
	}
	*/
	
	@RequestMapping("hellouser")
	public ModelAndView helloUser(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName); //Key-value pair
		mv.setViewName("hellouser");
		return mv;	
	}
	

}
