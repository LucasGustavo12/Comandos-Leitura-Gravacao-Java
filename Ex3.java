package comandosLeituraGravacao;

import java.util.Scanner;

//Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
public class Ex3 {

	public static void main(String[] args) {
		
		double consumo,dist,comb;
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quanto foi a distancia percorrida em KM/h? ");
		dist = entrada.nextDouble();
		System.out.println("Qual foi o total de combustivel? ");
		comb = entrada.nextDouble();
		consumo = (dist + comb) / 2;
		
		System.out.println("O consumo medio do automovel foi de: " + consumo);
		
		entrada.close();
	}

}
