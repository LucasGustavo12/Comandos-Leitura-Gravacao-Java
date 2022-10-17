package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos;
public class Ex2 {

	public static void main(String[] args) {
		int n1, n2, soma, multiplicacao;
		double divisao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		soma = n1 + n2;
		multiplicacao = n1 * n2;
		divisao = n1/n2;
		System.out.println("O resultado da soma é : " + soma );
		System.out.println("O resultado da divisao é : " + divisao);
		System.out.println("O resultado da multiplicacao é : " + multiplicacao);
	
		entrada.close();

	}

}
