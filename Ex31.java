package comandosLeituraGravacao;

import java.util.Scanner;

//Dados três valores A, B e C, em que A e B são números reais e C é um caractere,pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
//caso contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
public class Ex31 {

	public static void main(String[] args) {
		
		double a;
		double b;
		char c;
		double res = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		System.out.println("Digite o valor de B ");
		b = entrada.nextInt();
		System.out.println("Digite a operação: ");
		c = entrada.next().charAt(0);
		
		if(c == '+') {
			res = a + b;
			System.out.println("Resultado: " + res);
		}else if(c == '-') {
			res = a - b;
			System.out.println("Resultado " + res);
		}else if(c == '*') {
			res = a * b;
			System.out.println("Resultado " + res);
		}else if(c == '/') {
			res = a / b;
			System.out.println("Resultado " + res);
		}else {
			System.out.println("Vlaor Inválido");
		}
		
		entrada.close();
		

	}

}
