package com.maxis.ebdautoassignmentbatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxis.ebdautoassignmentbatch.request.UserDetails;

@Controller
public class MainController {

	

	@RequestMapping(value = { "/","/logout" }, method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "loginPage";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String loginValidate(Model model) {
		model.addAttribute("userDetails", new UserDetails());
		return "homePage";
	}

	@RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
	public String contactusPage(Model model) {
		model.addAttribute("userDetails", new UserDetails());
		return "contactusPage";
	}
}
