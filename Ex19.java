package comandosLeituraGravacao;

import java.util.Scanner;
//Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. No final informe total de homens e de mulheres;
public class Ex19 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		
		String nome;
		char sexo;
		int sexoM = 0;
		int sexoF = 0;
		
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		while(contador < 5) {
			System.out.println("Nome: ");
			nome = entrada.next();
			System.out.println("Digite o sexo 'M' ou 'F' ");
			sexo = entrada.next().charAt(0);
			if (sexo == 'm' || sexo == 'M') {
				sexoM++;
			}else if(sexo == 'f' || sexo == 'F') {
				sexoF++;
			}else {
				System.out.println("Valor inválido");
			}
			contador++;
		}
		
		System.out.println("Total pessoas do sexo masculino: " + sexoM);
		System.out.println("Total pessoas do sexo feminino: " + sexoF);

		entrada.close();
		
		

	}

}
