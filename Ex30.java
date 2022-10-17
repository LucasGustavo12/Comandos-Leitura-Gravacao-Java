package comandosLeituraGravacao;
//Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		n2 = entrada.nextInt();
		System.out.println("Digite o terceiro valor");
		n3 = entrada.nextInt();
		
		List<Integer> numeros = Arrays.asList(n1,n2,n3);
		
		Collections.sort(numeros);
		entrada.close();
		
		System.out.println(numeros);
		
	}

}
