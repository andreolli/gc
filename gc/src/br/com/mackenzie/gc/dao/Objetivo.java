package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;

public class Objetivo extends HibernateDAO{
	
	   public Objetivo load(long id){
	    	getSession().beginTransaction();   
	    	Objetivo  obj = (Objetivo)getSession().load(Objetivo.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }

}
