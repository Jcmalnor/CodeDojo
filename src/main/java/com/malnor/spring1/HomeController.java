package com.malnor.spring1;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String enroll(Model model, HttpServletRequest request) {
		
		model.addAttribute("fn", request.getParameter("firstname"));
		model.addAttribute("ln", request.getParameter("lastname"));
		model.addAttribute("em", request.getParameter("email"));
		model.addAttribute("classes", request.getParameter("class"));
		
		return "home";
	}
	
}
