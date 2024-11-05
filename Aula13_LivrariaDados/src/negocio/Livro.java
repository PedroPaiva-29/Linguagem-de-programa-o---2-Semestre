package negocio;

import persistencia.LivroDAO;

public class Livro {
	//Propriedades da classe
	private int id = 0;
	private Autor objAutor = null;
	private String titulo = "";
	
	//Métodos construtores da classe
	public Livro() {
		super();
	
	}
	
	public Livro(int id, Autor objAutor, String titulo) {
		super();
		this.id = id;
		this.objAutor = objAutor;
		this.titulo = titulo;
	}

	//Métodos de acesso da classe
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Autor getObjAutor() {
		return objAutor;
	}

	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//Métodos da classe
	public void persistir() throws Exception {
		new LivroDAO().persistir(this);
		
	}
	
}
