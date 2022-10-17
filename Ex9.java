package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex9 {
	//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;

	public static void main(String[] args) {
		
		double valorDepositado, valorRendimento, valorTotal;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o valor de deposito: ");
		valorDepositado = entrada.nextDouble();
		
		valorRendimento = valorDepositado * 0.007;
		
		valorTotal = valorDepositado + valorRendimento;
		
		System.out.println("O valor total com rendimento será de:  " + valorTotal);

		entrada.close();
		

	}

}
