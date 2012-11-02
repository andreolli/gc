package br.com.mackenzie.gc.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class BuscaProdutos2 {
	
	public static void main(String[] args) {
		
		Session session = new HibernateUtil().getSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery(
						"select p from Produto as p where p.id = :paramId");
		
		query.setParameter("paramId", 4L);
		
		List<Produto> produtos = (List<Produto>) query.list();
		
		for(Produto p : produtos){
			
			System.out.println("Nome do produto: " + p.getNome());	
			
		}	
	}
	
}
