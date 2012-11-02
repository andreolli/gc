package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Experiencia;

public class ExperienciaDAO extends HibernateDAO{

	   public Experiencia load(long id){
	    	getSession().beginTransaction();   
	    	Experiencia  obj = (Experiencia)getSession().load(Experiencia.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }
	
	
}
