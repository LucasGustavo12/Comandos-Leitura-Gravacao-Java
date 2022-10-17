package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, menor que 25 ou igual a 40;
public class Ex23 {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		numero = entrada.nextInt();
		if(numero > 80) {
			System.out.println("Número maior que 80");
		}else if(numero < 25) {
			System.out.println("O número é menor que 25");
		}else if(numero == 40) {
			System.out.println("Número é igual a 40");
		}
		entrada.close();
	}

}
