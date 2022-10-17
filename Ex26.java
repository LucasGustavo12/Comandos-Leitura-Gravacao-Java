package comandosLeituraGravacao;

import java.util.Scanner;

//Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido;
public class Ex26 {
	public static void main(String[] args) {
		int n1;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 5");
		n1 = entrada.nextInt();
		switch (n1) {
		case 1:
			System.out.println("UM");
			break;
		case 2:
			System.out.println("DOIS");
			break;
		case 3:
			System.out.println("TRÊS");
			break;
		case 4:
			System.out.println("QUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		default:
			System.out.println("número inválido");
		}
		entrada.close();

	}

}
