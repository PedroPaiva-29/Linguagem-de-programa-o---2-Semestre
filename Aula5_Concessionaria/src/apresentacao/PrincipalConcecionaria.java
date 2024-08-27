package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class PrincipalConcecionaria {
	public static void main(String[] args) {
	//Declaração de Variaveis
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	Veiculo objVeiculo = null;
	String opcao = "";
	
	//Entrada
	try {
		System.out.print("Digite <C> para carro ou " + "<M> para moto: ");
		opcao = leitor.readLine();
		
		if (opcao.equalsIgnoreCase("C")) {
			objVeiculo = new Carro();
		}else {
			objVeiculo = new Moto();
		}
	
	//Entrada de dados
	System.out.print("Digite o modelo do veículo: ");
	objVeiculo.setModelo(leitor.readLine());
	
	System.out.print("Digite o fabricante do veículo: ");
	objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
	
	System.out.print("Digite a cor do veículo: ");
	objVeiculo.setCor(leitor.readLine());
	
	if (opcao.equalsIgnoreCase("C")) {
		System.out.print("Digite <S> para teto solar: ");
		((Carro ) objVeiculo).setTetosolar(leitor.readLine().equalsIgnoreCase("S"));
	} else {
		System.out.print("Digite a cilindrada: ");
		((Moto) objVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
	}
	
	} catch (Exception erro) {}
	
	//Saida de dados
	System.out.println("Modelo: " + objVeiculo.getModelo());
	System.out.println("Fabricante: " + objVeiculo.getObjFabricante().getNome());
	System.out.println("Cor: " + objVeiculo.getCor());
	
	if (opcao.equalsIgnoreCase("C")) {
	System.out.println("Teto Solar: " + (((Carro) objVeiculo).isTetosolar() ? "SIM" : "NÃO"));
	} else {
		System.out.println("Cilindrada: " + ((Moto) objVeiculo).getCilindrada());
	}
}
}