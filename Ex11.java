package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex11 {
	//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
	public static void main(String[] args) {
		
		double preco, percentual, precoCusto;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o preco do produto: ");
		preco = entrada.nextDouble();
		System.out.println("Informe o percentual Ex para 15% informe 0,15: ");
		percentual = entrada.nextDouble();
		
		precoCusto = preco + percentual;
		
		System.out.println("Vlaor da venda: R$ " + precoCusto);

		entrada.close();
		

	}

}
