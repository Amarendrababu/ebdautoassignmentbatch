package com.maxis.ebdautoassignmentbatch.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maxis.ebdautoassignmentbatch.request.UserReq;

@Controller
public class LoginController {

	/*@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@GetMapping("/")
	public String root() {
		return "login";
	}

	@PostMapping("/login")
	public ModelAndView validateLoginUser(@ModelAttribute("userReq") UserReq userReq, HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("UserReq======>" + userReq);

		modelAndView.setViewName("home");

		return modelAndView;

	}*/
}
