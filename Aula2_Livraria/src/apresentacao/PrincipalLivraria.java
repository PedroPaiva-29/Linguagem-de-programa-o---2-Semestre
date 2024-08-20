package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Autor;
import negocio.livro;

public class PrincipalLivraria {
	public static void main (String[] args) {
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		livro objLivro = new livro();
		
		//Entrada de dados
		try {
			System.out.print("Digite o título do livro: ");
			objLivro.setTitulo(leitor.readLine());
			
			System.out.println("Digite o nome do autor do livro:");
			objLivro.setobjAutor(new Autor(leitor.readLine()));
			
			System.out.print("Digite o gênero do livro:");
			objLivro.setGenero(leitor.readLine());
			
		}catch (Exception erro) {}
		
		//Saida de dados
		System.out.println("Título do livro: " + objLivro.getTitulo());
		System.out.println("Autor do livro: " + objLivro.getobjAutor().getNome());
		System.out.println("Gênero do livro: " + objLivro.getGenero());
		
		
	}
}
