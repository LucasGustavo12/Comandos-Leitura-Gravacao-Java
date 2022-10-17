package comandosLeituraGravacao;

import java.util.Scanner;

//A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
public class Ex10 {

	public static void main(String[] args) {
		
		double preco, prestacoes;
		System.out.println("Digite o preco do produto: ");
		Scanner entrada = new Scanner(System.in);
		preco = entrada.nextDouble();
		
		prestacoes = preco / 5;
		
		System.out.println("Parcelas de 5X de R$: " + prestacoes );
		
		
		

		entrada.close();
		
	}

}
