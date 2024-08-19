package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class PrincipalControleDeEstoque {
	public static void main (String[] args) {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		
		//Entrada de dados
		try {
		System.out.print("Digite o nome do produto:");
		objProduto.setNome(leitor.readLine());
		
		System.out.print("Digite o número da estante:");
		objProduto.setobjEstante(new Estante(Integer.parseInt(leitor.readLine())));
		
		System.out.print("Digite a quantidade de produtos:");
		objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
		
		}catch (Exception erro) {}
		
		//Saida de dados
		System.out.println("Nome:" + objProduto.getNome());
		System.out.println("Estante: " + objProduto.getobjEstante().getNumero());
		System.out.println("Quantidade:" + objProduto.getQuantidade());
		
	}
}
