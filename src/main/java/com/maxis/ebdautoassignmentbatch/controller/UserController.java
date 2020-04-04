package com.maxis.ebdautoassignmentbatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxis.ebdautoassignmentbatch.request.UserDetails;
import com.maxis.ebdautoassignmentbatch.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	
	
	@RequestMapping(value = { "/getuser" }, method = RequestMethod.GET)
	public String getEbdUserDetails(@RequestParam(value = "userid",required = false) String userId,Model model) {
		userService.getEbdUserDetails(userId, model);
		return "contactusPage";
	}

	
	@RequestMapping(value = { "/updateuser" }, method = RequestMethod.POST)
	public String updateEbdUserDetails(@ModelAttribute("userDetails") UserDetails userDetails,Model model) {
		userService.updateUserDetails(userDetails, model);
		return "contactusPage";
	}
}
