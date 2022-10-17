package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		
		
		if(numero >= 10 && numero <= 200) {
			System.out.println(numero + "está entre 10 e 200");
		} else {
			System.out.println(numero + "Não está entre 10 e 200");
		}

		entrada.close();

	}

}
