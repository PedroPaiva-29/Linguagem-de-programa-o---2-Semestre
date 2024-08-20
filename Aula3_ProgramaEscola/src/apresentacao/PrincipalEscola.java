package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class PrincipalEscola {
	public static void main(String[] args) {
		// Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Professor objProfessor = new Professor();
		Turma objTurma = new Turma();

		// Entrada de dados
		try {
			System.out.print("Digite o nome da cadeira: ");
			objTurma.setObjCadeira(new Cadeira(leitor.readLine()));

			System.out.print("Digite o nome do professor: ");
			objProfessor.setNome(leitor.readLine());

			System.out.print("Digite o titulo do professor: ");
			objProfessor.setTitulo(leitor.readLine());

			System.out.print("Digite o salario do professor: ");
			objProfessor.setSalario(Double.parseDouble(leitor.readLine()));

			objTurma.setObjProfessor(objProfessor);

			System.out.print("Digite a letra da turma: ");
			objTurma.setLetra(leitor.readLine());
			
			do {
				Aluno objAluno = new Aluno();
				
				System.out.print("Digite a matricula do aluno: ");
				objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
				
				System.out.print("Digite o nome do aluno: ");
				objAluno.setNome(leitor.readLine());
				
				objTurma.adicionarAluno(objAluno);
				
				System.out.print("Digite <S> para mais alunos: ");
				} while (leitor.readLine().equalsIgnoreCase("S"));

		} catch (Exception erro) {}
		
		//Saida de dados
		System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
		System.out.println("Turma: " + objTurma.getLetra());
		System.out.println("Professor: " + objTurma.getObjProfessor().getTitulo() + " " + objTurma.getObjProfessor().getNome());
		System.out.println("Alunos: ");
		objTurma.listarAlunos();
		}

	}

