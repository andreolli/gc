package br.com.mackenzie.gc.hibernate;

public class PessoaDAO extends HibernateDAO{
	
	   public Pessoa load(long id){
	    	getSession().beginTransaction();   
	    	Pessoa  p = (Pessoa)getSession().load(Pessoa.class,id);        
	        getSession().getTransaction().commit();
	        getSession().close();
	        return p;
	    }
}
