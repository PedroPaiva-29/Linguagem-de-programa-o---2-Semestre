package negocio;

public class Produto {
	//Propriedades da classe
	private String nome = "";
	private Estante objEstante = null;
	private int quantidade = 0;
	
	//Metodos construtores da classe
	public Produto() {
		
	}
	
	public Produto(String nome, Estante objEstante, int quantidade) {
		this.nome = nome;
		this.objEstante = objEstante;
		this.quantidade = quantidade;
	}
	
	//Metodos de acesso da classe
	public String getNome() {
		return nome;
	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public Estante getobjEstante() {
		return objEstante;
		
	}
	
	public void setobjEstante(Estante objEstante) {
		this.objEstante = objEstante;
		
	}
	
	public int getQuantidade() {
		return quantidade;
		
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
