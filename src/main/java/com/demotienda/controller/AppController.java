package com.demotienda.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/usuarios")
	public String usuarios() {
		return "usuarios";
	}
	
	@RequestMapping("/validador")
	public String validador(HttpServletRequest req, HttpServletRequest resp) {
		
		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");
		
		if(usuario.equals("admininicial") && password.equals("admin12345")) {
			return "menu";
		}else {
			return "error";
		}
		
	}
	
	
	

}
