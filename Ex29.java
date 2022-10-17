package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex29 {
//Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
	public static void main(String[] args) {
		int mes;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o mês de 1 a 12: ");
		mes = entrada.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("JANEIRO");
			break;
		case 2:
			System.out.println("FEVEREIRO");
			break;
		case 3:
			System.out.println("MARÇO");
			break;
		case 4:
			System.out.println("ABRIL");
			break;
		case 5:
			System.out.println("MAIO");
			break;
		case 6:
			System.out.println("JUNHO");
			break;
		case 7:
			System.out.println("JULHO");
			break;
		case 8:
			System.out.println("AGOSTO");
			break;
		case 9:
			System.out.println("SETEMBRO");
			break;
		case 10:
			System.out.println("OUTUBRO");
			break;
		case 11:
			System.out.println("NOVEMBRO");
			break;
		case 12:
			System.out.println("DEZEMBRO");
			break;
		default	:
			System.out.println("VALIDE MÊS INVÁLIDO");
		}

		entrada.close();

	}

}
