package com.guishan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guishan.entity.User;
import com.guishan.service.UserServer;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServer userSerivice;
	
	@RequestMapping(value="/query",method=RequestMethod.POST)
	public String query(HttpServletRequest request,Model model){
		 User user=userSerivice.query();
		 model.addAttribute("user", user);
		return "index";
	}
}
