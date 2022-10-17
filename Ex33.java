package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex33 {
	/*
	 * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça
	 * um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o
	 * valor da hora/aula segue a tabela abaixo: a. Professor Nível 1 R$12,00 por
	 * hora/aula; b. Professor Nível 2 R$17,00 por hora/aula; c. Professor Nível 3
	 * R$25,00 por hora/aula.
	 */

	public static void main(String[] args) {
		int nivel;
		double horas;
		double a = 12;
		double b = 17;
		double c = 25;
		double total;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o nivel do professor? (1, 2, 3): ");
		nivel = entrada.nextInt();
		System.out.println("Qual a quantidade de horas trabalhadas?: ");
		horas = entrada.nextDouble();
		if (nivel == 1) {
			total = horas * a;
			System.out.println("Valor da aula R$ " + total);
		}else if(nivel == 2) {
			total = horas * b;
			System.out.println("Valor da aula R$ " + total);
		}else if(nivel == 3) {
			total = horas * c;
			System.out.println("Valor da aula R$ " + total);
		}else {
			System.out.println("Valor Inválido");
		}
		

		entrada.close();

	}

}
