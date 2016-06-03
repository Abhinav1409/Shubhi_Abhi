package com.bluesapphire.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bluesapphire.view.UserRegFormView;


@Controller
public class UserRegController {
	@RequestMapping(value="/userReg", method=RequestMethod.GET)
	public String userRegRenderer(Model model) {
		
		model.addAttribute("userRegFormView", new UserRegFormView());
		model.addAttribute("message", "User Registration Form");
		return "userRegForm";
	}
	@RequestMapping(value="/userRegFormSubmit", method=RequestMethod.POST)
	public String userRegHandler(Model model, @Valid @ModelAttribute UserRegFormView userRegFormView, BindingResult result ) {
		if(result.hasErrors()) {
			return "userRegForm";
		}
		model.addAttribute("userDetails", userRegFormView);
		model.addAttribute("message", "Congrtas..You have been successfully Registere. An Email has been sent to you on "+userRegFormView.getEmailId());
		return "userRegSuccess";
	}

}
