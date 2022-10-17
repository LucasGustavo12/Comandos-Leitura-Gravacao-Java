package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais.
//Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
public class Ex25 {
	public static void main(String[] args) {
		int n1, n2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = entrada.nextInt();
		if(n1 == n2) {
			System.out.println("Os números são iguais");
		}else if(n1 > n2) {
			System.out.println(n1 + "É maior que " + n2 + " E são diferentes");
		}else if(n2 > n1) {
			System.out.println(n1 + "É menor que " + n2 + " E são diferentes");
		}else {
			System.out.println("Digite um valor válido");
		}
		

		entrada.close();
	}
	
}
