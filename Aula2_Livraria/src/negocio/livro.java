package negocio;

public class livro {
	// Propriedades da classe
	private String titulo = "";
	private Autor objAutor = null;
	private String genero = "";
	
	// Metodos construtores da classe
	public livro() {
		
	}
	
	public livro(String titulo, Autor objAutor, String genero) {
		this.titulo = titulo;
		this.objAutor = objAutor;
		this.genero = genero;
		
	}
	
	//Metodos de acesso da classe
	public String getTitulo() {
		return titulo;
		
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		
	}
	
	public Autor getobjAutor() {
		return objAutor;
		
	}
	
	public void setobjAutor(Autor objAutor) {
		this.objAutor = objAutor;
		
	}
	
	public String getGenero() {
		return genero;
		
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
