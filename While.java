package comandosLeituraGravacao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		int totalAlunos = 10;

		Scanner entrada = new Scanner(System.in);


		while (totalAlunos > 0) {
			String nomeAluno = entrada.nextLine();
			int idadeAluno = entrada.nextInt();

			System.out.println("O nome do Aluno é " + nomeAluno + "A idade do aluno é " + idadeAluno);

			totalAlunos = totalAlunos -1;
		}
		
	

	}
}
