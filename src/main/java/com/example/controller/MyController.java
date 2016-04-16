package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class MyController {

	@RequestMapping(method = RequestMethod.GET)
	public String listCity() {
		return "haha";
	}

}
