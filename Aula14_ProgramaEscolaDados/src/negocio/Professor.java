package negocio;

import java.util.Collection;

import persistencia.ProfessorDAO;

public class Professor extends Entidade {
	//Propriedades da classe
	private String nome = "";
	private String titulacao = "";
	
	//Métodos construtores da classe	
	public Professor() {
		super();
	}


	public Professor(int id, String nome, String titulacao) {
		super(id);
		this.nome = nome;
		this.titulacao = titulacao;
	}

	//Métodos de acesso da classe
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTitulacao() {
		return titulacao;
	}


	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
	//Métodos da classe
	public static Collection<Professor> getTodos() throws Exception {
		return new ProfessorDAO().getTodos();
		
}
}
