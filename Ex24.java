package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		char desejaContinuar = 's';
		
		while(desejaContinuar == 's' || desejaContinuar == 'S') {
			
			System.out.println("Digite um numero");
			int numero = entrada.nextInt();
			
			if(numero == 0) {
				System.out.println("numero é igual a : 0");
			}else if(numero > 0) {
				System.out.println("numero é positivo");
			}else {
				System.out.println("numero é negativo");
			}
			
			System.out.println("Deseja continuar S ou N: ");
			desejaContinuar = entrada.next().charAt(0);
			
			entrada.close();
		}
		
	}

}
