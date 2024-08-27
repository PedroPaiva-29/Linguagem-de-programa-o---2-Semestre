package negocio;

public class Leopardo extends Mamifero {
	//Propriedades da classe
	private double velocidade = 0;

	//Metodos construtores da classe
	public Leopardo() {
		super();
	}

	public Leopardo(double peso, String nome, double altura, int litrosLeite, double velocidade) {
		super(peso, nome, altura, litrosLeite);
		this.velocidade = velocidade;
	}

	//Metodos de acesso da classe
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//Metodos da classe
	public void correr() {
		System.out.println("Run Forest Run!!!");
	}
	
}
