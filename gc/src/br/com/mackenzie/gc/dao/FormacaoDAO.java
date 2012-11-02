package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Formacao;

public class FormacaoDAO extends HibernateDAO{
	
	   public Formacao load(long id){
	    	getSession().beginTransaction();   
	    	Formacao  obj = (Formacao)getSession().load(Formacao.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }

}
