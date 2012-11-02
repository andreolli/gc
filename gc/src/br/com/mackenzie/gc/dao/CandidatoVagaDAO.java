package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.CandidatoVaga;

public class CandidatoVagaDAO extends HibernateDAO{
	
	   public CandidatoVaga load(long id){
	    	getSession().beginTransaction();   
	    	CandidatoVaga  obj = (CandidatoVaga)getSession().load(CandidatoVaga.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }

}
