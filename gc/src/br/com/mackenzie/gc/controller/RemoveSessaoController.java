package br.com.mackenzie.gc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RemoveSessaoController {
	
	@RequestMapping("removeSessao")
	public String removeSessao(HttpSession session){
		 session.invalidate();  
		 return "forward:loginForm";
	}
}
