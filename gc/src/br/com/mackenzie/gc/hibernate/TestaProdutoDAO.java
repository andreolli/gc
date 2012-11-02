package br.com.mackenzie.gc.hibernate;


public class TestaProdutoDAO {

	public static void main(String[] args) {
		
		Produto prod = new Produto();
		prod.setId(9L);
		prod.setDescricao("  ");
		prod.setNome("  ");
		prod.setPreco(9.15);
		
		/*HibernateDAO hb = new HibernateDAO();
		
		hb.update(prod);
		*/
		PessoaDAO pes = new PessoaDAO();
		Pessoa p = pes.load(1L);
		System.out.println("INFO: " + p.getNome());
		
	}
}
