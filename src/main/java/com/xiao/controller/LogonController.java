package com.xiao.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xiao.domain.LogonForm;
import com.xiao.service.UserService;

@Controller
public class LogonController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="logon")
	public ModelAndView logon(HttpServletRequest request,HttpServletResponse response,LogonForm logonForm){
		  boolean valid = userService.hasMatchUser(logonForm.getUsername(), logonForm.getPassword());
		  if(valid){
			  String succ = "welcome " + logonForm.getUsername() + " !";
			  userService.succLogon(logonForm.getUsername(), request.getRemoteAddr());
			  return new ModelAndView("index/index","command",succ);
		  }	
		  String fail = "username or password incorrect";
		  return new ModelAndView("login/logon","command",fail);	 
		  
	}
	
	
}
