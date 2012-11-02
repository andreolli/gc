package br.com.mackenzie.gc.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mackenzie.gc.dao.UsuarioDAO;
import br.com.mackenzie.gc.modelo.Usuario;
@Controller
public class LoginController {
	
	@RequestMapping("loginForm")
	public String loginForm(){
		return "formulario-login";
	}
	
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario,HttpSession session){
		if(new UsuarioDAO().existeUsuario(usuario)){
			session.setAttribute("usuarioLogado",usuario);
			return "menu";
		}return "redirect:loginForm";
	}

}
