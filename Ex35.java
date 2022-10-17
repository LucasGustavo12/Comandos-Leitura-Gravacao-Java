package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:

/*
 * Tipo de Cliente Valor do KW/h
	a. (Residência) 0,60;
	b. (Comércio) 0,48;
	c. (Indústria) 1,29.
 */

public class Ex35 {
		public static void main(String[] args) {
			char tipo;
			double total;
			double horas;
			
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite qual o tipo de Cliente A, B, ou C");
			tipo = entrada.next().charAt(0);
			System.out.println("Digite quantas horas foram gastas: ");
			horas = entrada.nextInt();
			if(tipo == 'a' || tipo == 'A') {
				total = horas * 0.60;
				System.out.println("Total de preço gasto R$: " + total);
			}else if(tipo == 'b' || tipo == 'B') {
				total = horas * 0.48;
				System.out.println("Total de preço gasto R$: " + total);
			}else if(tipo == 'c' || tipo == 'C') {
				total = horas * 1.29;
				System.out.println("Total de preço gasto R$: " + total);
			}else {
				System.out.println("Valor inválido");
			}
			

			entrada.close();
		}

}
