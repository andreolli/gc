package br.com.mackenzie.gc.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.mackenzie.gc.modelo.Usuario;


public class AdicionaProduto {

	public static void main(String[] args) {
		/*		
		Produto p = new Produto();
		p.setNome("pano de prato");
		p.setDescricao("utensilio");
		p.setPreco(2.00);	


		 * pega as config do hibernate.properties
		 * e o molde da classe		 

		
		Session session = new HibernateUtil().getSession();
		
		session.beginTransaction();
		
		session.save(p);
		
		session.getTransaction().commit();
				
		System.out.println("ID do produto: " + p.getId());		

		session.close();
		
		new AbstractDAO().getSession();
		new AbstractDAO().save(p);		
*/
		
		Usuario user = new Usuario();
		user.setLogin("adm");
		user.setSenha("adm");
		
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Produto.class);
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session =  factory.openSession();
		
		/*
		List<Usuario> lista = session.createCriteria(Usuario.class).list();
						
			Criteria query = session.createCriteria("select p from Usuario as p where p.login = :paramLogin and p.senha = :paramSenha");
	       
			query.setParameter("paramLogin", usuario.getLogin());
			query.setParameter("paramSenha", usuario.getSenha());			
		
		getSession().close();
		 
		if (lista.size() >= 1) {
			return true;
		}
		return false;		
		*/	
		
		Query query = session.createQuery("select p from Produto as p");
		
		List<Produto> produtos = (List<Produto>) query.list();
		
		for(Produto p : produtos){		
			System.out.println("Nome do produto: " + p.getNome());		
		}
		
		/*
		Criteria criteria = (Criteria) session.createCriteria(Usuario.class);

		List<Usuario> lista = criteria.list();
		
		for(Usuario us: lista){
			if(us.getLogin() == user.getLogin() && us.getSenha() == user.getSenha()){
				System.out.println("tem");			
			}			
		}
		System.out.println("não tem");
		*/
	}

}
