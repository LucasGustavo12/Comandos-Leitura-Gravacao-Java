package comandosLeituraGravacao;

import java.util.Scanner;

//Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias

/*
 * a. Infantil A = 5 - 7 anos;
	b. Infantil B = 8 - 10 anos;
   c. Juvenil A = 11- 13 anos;
   d. Juvenil B = 14 - 17 anos;
   e. Sênior = 18 - 25 anos.
   Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
 */
public class Ex34 {

	public static void main(String[] args) {
		int idade;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a idade do nadador para saber a sua categoria: ");
		idade = entrada.nextInt();
		if (idade >= 5 && idade <= 7) {
			System.out.println("INFANTIL A");
		} else if(idade >= 8 && idade <= 10) {
			System.out.println("INFANTIL B");
		}else if(idade >= 11 && idade <= 13) {
			System.out.println("JUVENIL A");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("JUVENIL B");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("SÊNIOR");
		}else {
			System.out.println("idade fora da faixa etária");
		}

		entrada.close();
	}

}
