package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
public class Ex1 {

	public static void main(String[] args) {
		
		int n1, n2, res;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		res = n1 + n2;
		System.out.println("O resultado é: " + res);
		entrada.close();
	

	}

}
