package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

public class Ex18 {

	public static void main(String[] args) {
		int contador = 1;
		int maiorIdade = 0, menorIdade = 0, idade;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dgite a idade de 75 pessoas: ");

		while (contador < 75) {
			idade = entrada.nextInt();

			if (idade >= 18) {
				maiorIdade++;	
			} else {
				menorIdade++;
			}
			contador++;

		}
		System.out.println("Menor Idade: " + menorIdade);
		System.out.println("Maior Idade: " + maiorIdade);

		entrada.close();
		

	}

}
