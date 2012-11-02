package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Candidato;

public class CandidatoDAO extends HibernateDAO {
	   public Candidato load(long id){
	    	getSession().beginTransaction();   
	    	Candidato  obj = (Candidato)getSession().load(Candidato.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }
}
