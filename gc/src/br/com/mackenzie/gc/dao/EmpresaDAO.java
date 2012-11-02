package br.com.mackenzie.gc.dao;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Empresa;

public class EmpresaDAO extends HibernateDAO{
	
	   public Empresa load(long id){
	    	getSession().beginTransaction();   
	    	Empresa  obj = (Empresa)getSession().load(Empresa.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return obj;
	    }

}
