package com.hamsterviel01.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
	
	@RequestMapping(value="/createNewPost")
	public void createNewPost() {
		
	}
}
