package com.bluesapphire.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bluesapphire.view.LoginView;



@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String signOnRenderer(Model model) {
		logger.info("Welcome to the App");
		
		model.addAttribute("loginView", new LoginView());
		model.addAttribute("message", "Welcome!! Please Enter the Login Credentials..");
		
		return "index";
		
	}
	
	@RequestMapping (value="/login", method=RequestMethod.POST)
	public String signOnHandler(Model model, @Valid @ModelAttribute LoginView loginView, BindingResult result ) {
		
	
		if(result.hasErrors()) {
			logger.info("Login Failed..!!");
			return "index";
		}
		logger.info("Login Successfully..");
		
		model.addAttribute("message", "Congrats "+loginView.getLoginId()+", You have successfully Login into the App...");		
		
		return "home";
	}
	
	
	@ModelAttribute
	public void commonTiles(Model model) {
	
		model.addAttribute("commonTiles", "Aadi Tech");
		
	}

}
