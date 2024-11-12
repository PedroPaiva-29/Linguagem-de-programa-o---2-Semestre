package negocio;

import persistencia.TurmaDAO;

public class Turma extends Entidade{
	//Propriedades da classe
	private Disciplina objDisciplina = null;
	private Professor objProfessor = null;
	private String letra = "";
	
	//Métodos construtores da classe
	public Turma() {
		super();
	}

	public Turma(int id, Disciplina objDisciplina, Professor objProfessor, String letra) {
		super(id);
		this.objDisciplina = objDisciplina;
		this.objProfessor = objProfessor;
		this.letra = letra;
	}

	//Métodos de acesso da classe
	public Disciplina getObjDisciplina() {
		return objDisciplina;
	}

	public void setObjDisciplina(Disciplina objDisciplina) {
		this.objDisciplina = objDisciplina;
	}

	public Professor getObjProfessor() {
		return objProfessor;
	}

	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	//Métodos da classe
	public void persistir() throws Exception {
		new TurmaDAO().persistir(this);
	}

}
