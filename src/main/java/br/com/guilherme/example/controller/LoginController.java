package br.com.guilherme.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value ="login")
public class LoginController {
	
	@GetMapping
	public String login() {
		return "login/login";
	}

}
