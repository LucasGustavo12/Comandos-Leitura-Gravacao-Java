package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex12 {
	
	/*
	 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados
	 *(primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado).
	 *Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo; 
	 */

	public static void main(String[] args) {
		double custoCarro;
		double custoFabrica = 0.45;
		double percentualDistri= 0.28;
		double custoCarroConsumidor;
		double custoFabricaTotal;
		double custoDistriTotal;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o custo do consumidor: ");
		custoCarro = entrada.nextDouble();
		
		custoFabricaTotal = custoCarro / custoFabrica;
		custoDistriTotal = custoCarro / percentualDistri;
		custoCarroConsumidor = custoCarro + custoFabricaTotal + custoDistriTotal;
		
		System.out.println(" O Custo do carro ao consumidor será de R$:  " + custoCarroConsumidor);
		
		entrada.close();

	}

}
