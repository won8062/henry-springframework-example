package com.example.springbootwebmustache;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/index")
	public ModelAndView getIndex() { 
		System.out.println("called!!!");
		return new ModelAndView("index"); 
	}
}
