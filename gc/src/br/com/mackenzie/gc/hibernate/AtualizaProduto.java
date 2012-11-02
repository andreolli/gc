package br.com.mackenzie.gc.hibernate;

import org.hibernate.Session;

public class AtualizaProduto {

	public static void main(String[] args) {

		Produto p = new Produto();
		
		p.setNome("faca");
		p.setDescricao("utensilios");
		p.setPreco(6.50);
		p.setId(3L);
		
		Session session = new HibernateUtil().getSession();
		
		session.beginTransaction();
	
		session.save(p);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
