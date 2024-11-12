package negocio;

import java.util.Collection;

import persistencia.DisciplinaDAO;

public class Disciplina extends Entidade {
	//Propriedades da classe
	private String nome = "";

	//Métodos construtores da classe
	public Disciplina() {
		super();
	}

	public Disciplina(int id, String nome) {
		super(id);
		this.nome = nome;
	}

	//Métodos de acesso da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Métodos da classe
	public static Collection<Disciplina> getTodos() throws Exception {
		return new DisciplinaDAO().getTodos();
		
	}
	
}
