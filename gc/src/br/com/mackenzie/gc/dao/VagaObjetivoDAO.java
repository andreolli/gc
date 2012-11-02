package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.VagaObjetivo;

public class VagaObjetivoDAO extends HibernateDAO{
	
	   public VagaObjetivo load(long id){
	    	getSession().beginTransaction();   
	    	VagaObjetivo  obj = (VagaObjetivo)getSession().load(VagaObjetivo.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }

}
