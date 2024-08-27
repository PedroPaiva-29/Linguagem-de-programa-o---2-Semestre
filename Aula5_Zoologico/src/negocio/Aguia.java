package negocio;

public class Aguia extends Ave {
	//Propriedades da classe
	private double autonomia = 0;

	//Metodos construtores da classe
	public Aguia() {
		super();
	}

	public Aguia(double peso, String nome, double altura, int qtdOvos, double autonomia) {
		super(peso, nome, altura, qtdOvos);
		this.autonomia = autonomia;
	}

	//Metodos de acesso da classe
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	//Metodos da classe
	public void voar() {
		System.out.println("Fly like an eagle, " + "into the future !");
		}
	

	}


