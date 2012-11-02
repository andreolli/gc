package br.com.mackenzie.gc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CarregaProduto {
	
	public static void main(String[] args) {
	
		Session session = new HibernateUtil().getSession();
		
		session.beginTransaction();
		
		Produto  p = (Produto)session.load(Produto.class,2L);
		
		System.out.println("Nome do produto: " + p.getNome());
		
		session.close();		
		
	}
}
