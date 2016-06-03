package com.bluesapphire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ForgotPwdController {
	@RequestMapping(value="/forgot", method=RequestMethod.GET)
	public String forgotPwdRenderer(Model model) {
		
		
		
		model.addAttribute("message", "Forgot Password");
		return "forgotPwd";
	}

}
