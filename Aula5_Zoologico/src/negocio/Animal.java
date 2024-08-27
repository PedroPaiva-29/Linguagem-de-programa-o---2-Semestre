package negocio;

public class Animal {
	//Propriedades da classe
	private double peso = 0;
	private String nome = "";
	private double altura = 0;
	
	//Metodos construtores da classe
	public Animal() {
		super();
	}

	public Animal(double peso, String nome, double altura) {
		super();
		this.peso = peso;
		this.nome = nome;
		this.altura = altura;
	}

	//Metodos de acesso da classe
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Metodos da classe
	public double calcularIMC() {
		return (getPeso() / Math.pow(getAltura(), 2));
	}
}
