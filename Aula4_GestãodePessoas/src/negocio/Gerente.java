package negocio;

public class Gerente extends Colaborador {
	//Propriedades da classe
	private double bonus = 0;

	//Metodos construtores da classe
	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
		//onde tiver a herança fazer um método vazio e um completamente cheio
	}

	//Metodos de acesso da classe
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//Metodos sobrescritos da classe
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
		
	}
	
	
	
}
