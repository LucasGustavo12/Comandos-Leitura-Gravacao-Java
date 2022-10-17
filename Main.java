package comandosLeituraGravacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = leitor.nextInt();
		
		float cotacaoDolar = leitor.nextFloat();
		
		double cotacaoEuro = leitor.nextDouble();
		
		String nome = leitor.nextLine();
		
		leitor.close();
		
		System.out.println(idade);
		System.out.println(cotacaoDolar);
		System.out.println(cotacaoEuro);
		System.out.println(nome);
	}

}
