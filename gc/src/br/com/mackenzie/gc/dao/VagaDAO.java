package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Vaga;

public class VagaDAO extends HibernateDAO{
	
	   public Vaga load(long id){
	    	getSession().beginTransaction();   
	    	Vaga  obj = (Vaga)getSession().load(Vaga.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }
	

}
