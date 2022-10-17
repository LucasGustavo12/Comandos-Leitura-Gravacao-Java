package comandosLeituraGravacao;

import java.util.Scanner;

//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média (aritmética), 
//informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
public class Ex16 {
	
	public static void main(String[] args) {
		double n1, n2, n3, media;
		String nome;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do aluno: ");
		nome = entrada.nextLine();
		System.out.println("Informe a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = entrada.nextDouble();

		media = (n1 + n2 + n3) / 3;
		
		if(media >= 7.0) {
			System.out.println(" O aluno: " + nome + "esta Aprovado");
		}else if(media <= 5) {
			System.out.println(" O aluno: " + nome + "esta Reprovado");
		}else if(media >= 5.1 || media <= 6.9) {
			System.out.println(" O aluno: " + nome + "esta de Recuperação");
		}
		
		entrada.close();
		
		
		
	}

}
