package br.com.mackenzie.gc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.mackenzie.gc.modelo.Candidato;
import br.com.mackenzie.gc.modelo.CandidatoVaga;
import br.com.mackenzie.gc.modelo.Empresa;
import br.com.mackenzie.gc.modelo.Experiencia;
import br.com.mackenzie.gc.modelo.Formacao;
import br.com.mackenzie.gc.modelo.Objetivo;
import br.com.mackenzie.gc.modelo.Usuario;
import br.com.mackenzie.gc.modelo.Vaga;
import br.com.mackenzie.gc.modelo.VagaObjetivo;

public class HibernateUtil {

	public static SessionFactory factory;
	
	static{
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Pessoa.class);
		cfg.addAnnotatedClass(Candidato.class);
		cfg.addAnnotatedClass(CandidatoVaga.class);
		cfg.addAnnotatedClass(Empresa.class);
		cfg.addAnnotatedClass(Experiencia.class);		
		cfg.addAnnotatedClass(Formacao.class);
		cfg.addAnnotatedClass(Objetivo.class);		
		cfg.addAnnotatedClass(Vaga.class);
		cfg.addAnnotatedClass(VagaObjetivo.class);		
		cfg.addAnnotatedClass(Usuario.class);
		
		factory = cfg.buildSessionFactory();		
	}
	
	public static Session getSession(){		
		return factory.openSession();
	}
}
