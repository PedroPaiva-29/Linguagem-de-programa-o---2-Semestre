package negocio;

public abstract class Mamifero extends Animal {
	//Propriedades da classe
	private int litrosLeite = 0;

	//Metodos construtores da classe
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, String nome, double altura, int litrosLeite) {
		super(peso, nome, altura);
		this.litrosLeite = litrosLeite;
	}

	//Metodos de acesso da classe
	public int getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(int litrosLeite) {
		this.litrosLeite = litrosLeite;
	}

	
	
	}
	
	
	

