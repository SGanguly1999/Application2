package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller1 {

	@RequestMapping("/view1")
	public String web()
	{
		System.out.println("Hello");
	 	return "Form";
	}
}
