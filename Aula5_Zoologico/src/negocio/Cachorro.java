package negocio;

public class Cachorro extends Mamifero{
	//Propriedades da classe
	private double forcaMordida = 0;

	//Metodos construtores da classe
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, String nome, double altura, int litrosLeite, double forcaMordida) {
		super(peso, nome, altura, litrosLeite);
		this.forcaMordida = forcaMordida;
	}

	//Metodos de acesso da classe
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	
	//Metodos da classe
	public void morder() {
		System.out.println("Wolf! Wolf!");
	}

}
