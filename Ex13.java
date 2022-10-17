package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex13 {
//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
	public static void main(String[] args) {
		int a;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		a = entrada.nextInt();
		if(a > 10) {
			System.out.println("É maior que 10 ");
		}else if(a < 10){
			System.out.println("É menor que 10 ");
		}else {
			System.out.println("Valor inválido ");
		}
		

		entrada.close();
		
		

	}

}
