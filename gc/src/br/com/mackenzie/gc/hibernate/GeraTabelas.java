package br.com.mackenzie.gc.hibernate;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GeraTabelas {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Pessoa.class);
		
		SchemaExport sc = new SchemaExport(cfg);
		sc.create(true, true);
	}

}
