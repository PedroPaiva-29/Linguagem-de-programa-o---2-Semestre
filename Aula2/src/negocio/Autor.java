package negocio;

public class Autor {
	// Propriedades da classe
	private String nome = "";
	
	// Metodos construtores da classe
	public Autor() {
		
	}
	
	public Autor(String nome) {
		this.nome = nome;
		
	}
	
	//Metodos de acesso da classe
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
}
