package br.com.mackenzie.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CurriculoController {
	
	@RequestMapping("paginaCurriculo")
	public String cadastro(){
		return "curriculo/cadastro";
	}
	
	
	
	

}
