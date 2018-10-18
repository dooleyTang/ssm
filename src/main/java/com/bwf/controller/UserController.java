package com.bwf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwf.entity.User;
import com.bwf.service.IUserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	
	@GetMapping("test/{id}")
	public String test(@PathVariable Integer id , ModelMap modelMap){
		
		User user =userService.getUserById(id);
		
		modelMap.addAttribute(user);
		
		return "html/test";
	}
	
}
