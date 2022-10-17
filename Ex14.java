package comandosLeituraGravacao;

import java.util.Scanner;

//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
public class Ex14 {
	
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = entrada.nextInt();
		
		
		if(a > b) {
			System.out.println(a + "é maior que " + b);
		}else if(a < b){
			System.out.println(b + " é maior que " + a);
		}else if(a == b) {
			System.out.println("Os valores são iguais");
		}else {
			System.out.println("Digite um valor válido");
		}
		
		entrada.close();
		
	}

}
