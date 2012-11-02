package br.com.mackenzie.gc.dao;

import java.util.List;

import org.hibernate.Query;

import br.com.mackenzie.gc.hibernate.HibernateDAO;
import br.com.mackenzie.gc.modelo.Usuario;

public class UsuarioDAO extends HibernateDAO {

	public Usuario load(long id) {
		getSession().beginTransaction();
		Usuario obj = (Usuario) getSession().load(Usuario.class, id);
		getSession().getTransaction().commit();
		getSession().close();
		return obj;
	}

	public boolean existeUsuario(Usuario usuario) {
	
		getSession().beginTransaction();
		
		Query query = getSession().createQuery("select p from Usuario as p where p.login = :paramLogin and p.senha = :paramSenha");
		query.setParameter("paramLogin", usuario.getLogin());
		query.setParameter("paramSenha", usuario.getSenha());	
		List lista = query.list();		
		
		if(lista.isEmpty()){			
			return false;
		}return true;	
	}
}
