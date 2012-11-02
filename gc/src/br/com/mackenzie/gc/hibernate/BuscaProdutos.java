package br.com.mackenzie.gc.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class BuscaProdutos {
	
	public static void main(String[] args) {
		
		Session session = new HibernateUtil().getSession();
		
		Query query = session.createQuery(
								"select p from Produto as p where p.preco > :paramPreco");
		query.setParameter("paramPreco", 1.0);
		
		List<Produto> lista =  query.list();
		
		for(Produto p : lista){
			System.out.println("\n-----------" + p.getNome());
		}
		
		session.close();
	}

}
