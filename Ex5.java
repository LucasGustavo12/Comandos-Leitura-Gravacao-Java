package comandosLeituraGravacao;

import java.util.Scanner;
//Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No finalinformar o nome do aluno e a sua média (aritmética);
public class Ex5 {

	public static void main(String[] args) {
		String nome;
		double n1, n2, n3, media;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		nome = entrada.nextLine();
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		
		System.out.println("O aluno " + nome + "Tem media de " + media);
		
		
		entrada.close();

	}

}
