package negocio;

public class Tipo {
	// Propriedades da classe
	private String descricao = "";

	// Metodos construtores da classe
	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	// Metodos de acesso da classe
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
