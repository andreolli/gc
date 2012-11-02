package br.com.mackenzie.gc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class HibernateUtil2 { 

	private static final SessionFactory sessionFactory; 

	//COnfigura um objeto do tipo SessionFactory que irá prover todos os objetos de Sessão (Session) 
	static { 
		/*sessionFactory = new Configuration().configure().buildSessionFactory();*/
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		sessionFactory = cfg.configure().buildSessionFactory();
	}
		
		//Obtem a Session 
	public static Session getSession(){ 
		return sessionFactory.openSession(); 
	} 
}	
	

