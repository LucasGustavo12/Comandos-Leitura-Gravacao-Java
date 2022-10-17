package comandosLeituraGravacao;

import java.util.Scanner;
//Elabore um algoritmo que efetue a apresentação do valor da conversão em real 
//(R$) de um valorlido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
public class Ex8 {

	public static void main(String[] args) {
		float dolar, real;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o valor em dolar");
		dolar = entrada.nextFloat();
		real = (float) (dolar * 5.16);
		
		System.out.println("Você possui em reais o total de R$: " + real + "reais");
		

		entrada.close();

	}

}
