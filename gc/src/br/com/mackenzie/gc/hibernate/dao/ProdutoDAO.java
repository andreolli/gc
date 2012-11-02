package br.com.mackenzie.gc.hibernate.dao;

import org.hibernate.Session;

import br.com.mackenzie.gc.hibernate.Produto;

public class ProdutoDAO {
	
	private Session session;
	
	public ProdutoDAO(Session session){
		this.session = session;
	}
	
	public void salva(Produto p){
		this.session.save(p);
	}
	
	public Produto procura(Long id){
		return (Produto) this.session.load(Produto.class, id);		
	}
	
	public void remove(Produto p){
		this.session.delete(p);
	}
	
	public void atualiza(Produto p){
		this.session.update(p);
	}	

}
