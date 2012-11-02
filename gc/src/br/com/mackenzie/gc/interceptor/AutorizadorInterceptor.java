package br.com.mackenzie.gc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class AutorizadorInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object controller)
	                    throws Exception {
		
		//pega o identificador uniforme de recursos(url)
		String uri = request.getRequestURI();
		if(uri.endsWith("loginForm") || uri.endsWith("efetuaLogin")){
			return true;
		}		
		
		if(request.getSession().getAttribute("usuarioLogado") != null){
			return true;	
		}
		response.sendRedirect("loginForm"); 
		return false;
		
		
		
	}
}
	
