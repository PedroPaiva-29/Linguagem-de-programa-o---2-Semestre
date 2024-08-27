package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class PrincipalZoologico {
	public static void main(String[] args) {
		//Declração de variaveis
		BufferedReader leitor = new BufferedReader (new InputStreamReader(System.in));
		Animal objAnimal = null;
		String opcao = "";
		
		//Entrada de dados
		try {
			System.out.print("Digite <C> para cachorro ou " + "<L> para leopardo ou " + 
		                     "<A> para águia:");
			opcao = leitor.readLine();
			
			if (opcao.equalsIgnoreCase("C")) {
				objAnimal = new Cachorro();
			} else if (opcao.equalsIgnoreCase("L")) {
				objAnimal = new Leopardo();
			} else {
				objAnimal = new Aguia();
			}
			
			System.out.print("Digite o nome do animal: ");
			objAnimal.setNome(leitor.readLine());
			
			System.out.print("Digite o peso do animal ");
			objAnimal.setPeso(Double.parseDouble(leitor.readLine()));
			
			System.out.print("Digite a altura do animal ");
			objAnimal.setAltura(Double.parseDouble(leitor.readLine()));
			
			if (opcao.equalsIgnoreCase("C")) {
				System.out.print("Digite a quantidade de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a força da mordida: ");
				((Cachorro) objAnimal).setForcaMordida(Double.parseDouble(leitor.readLine()));
				
			} else if (opcao.equalsIgnoreCase("L")) {
				System.out.print("Digite a quantidade de leite: ");
				((Mamifero) objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a velocidade: ");
				((Leopardo) objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
			
			} else {
				System.out.print("Digite a quantidade de ovos: ");
				((Ave) objAnimal).setQtdOvos(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite a autonomia de voo: ");
				((Aguia) objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
				
			}
			
		} catch (Exception erro) {}
		
		//Saida de dados
		System.out.println("Nome: " + objAnimal.getNome());
		System.out.println("IMC: " + objAnimal.calcularIMC());
		if (opcao.equalsIgnoreCase("C")) {
			((Cachorro) objAnimal).morder();
		} else if (opcao.equalsIgnoreCase("L")) {
			((Leopardo) objAnimal).correr();
		} else {
			((Aguia) objAnimal).voar();
		}
	}
	}

