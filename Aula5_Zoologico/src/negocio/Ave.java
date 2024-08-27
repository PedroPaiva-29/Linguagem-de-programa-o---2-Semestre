package negocio;

public abstract class Ave extends Animal {
	//Propriedades da classe
	private int qtdOvos = 0;

	//Metodos construtores da classe
	public Ave() {
		super();
	}

	public Ave(double peso, String nome, double altura, int qtdOvos) {
		super(peso, nome, altura);
		this.qtdOvos = qtdOvos;
	}

	//Metodos de acesso da classe
	public int getQtdOvos() {
		return qtdOvos;
	}

	public void setQtdOvos(int qtdOvos) {
		this.qtdOvos = qtdOvos;
	}
	
	
}
