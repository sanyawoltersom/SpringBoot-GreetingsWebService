package com.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.base.dao.AUserRepo;
import com.base.model.AUsers;

@Controller
public class HomeController {
	
	@Autowired
	AUserRepo repo;
	
	@RequestMapping("/")
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
	
	
	@RequestMapping("hellouser")
	public ModelAndView helloUser(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName); //Key-value pair
		mv.setViewName("hellouser");
		return mv;	
	}*/
	
	@RequestMapping("/addUser")
	public String addUser(AUsers auser){
		repo.save(auser);
		return "hellouser";
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(@RequestParam("uid") int uid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("getUser");
		AUsers user = repo.findById(uid).orElse(new AUsers());	
		return mv;
	}

}
