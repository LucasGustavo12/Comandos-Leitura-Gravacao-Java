package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex28 {
//Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios:
	
	/*
	 * a. 50% para aqueles que ganham menos do que três salários mínimos; b. 20%
	 * para aqueles que ganham entre três até dez salários mínimos; c. 15% para
	 * aqueles que ganham acima de dez até vinte salários mínimos; d. 10% para os
	 * demais funcionários.
	 */
	
	public static void main(String[] args) {
		String funcionario;
		double salarioMinimo = 1212;
		double salario;
		double reajuste;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		funcionario = entrada.nextLine();
		System.out.println("Valor que ganha: ");
		salario = entrada.nextDouble();
		if(salario <= salarioMinimo * 3) {
			reajuste = (606.0);
			salario = salario + reajuste;
			System.out.println("O funcionario" + funcionario + "teve um reajuste de R$: " + reajuste + "e agora ganha R$: " + salario);
		}else if(salario <= salarioMinimo * 10 || salario >= salarioMinimo * 3) {
			reajuste = (15 * 100 / salario);
			salario = salario + reajuste;
			System.out.println("O funcionario" + funcionario + "teve um reajuste de R$: " + reajuste + "e agora ganha R$: " + salario);
		}else if(salario >= salarioMinimo * 10 || salario >= salarioMinimo * 20) {
			reajuste = (15 * 100 / salario);
			salario = salario + reajuste;
			System.out.println("O funcionario" + funcionario + "teve um reajuste de R$: " + reajuste + "e agora ganha R$: " + salario);
		}else {
			reajuste = (10 * 100 / salario);
			salario = salario + reajuste;
			System.out.println("O funcionario" + funcionario + "teve um reajuste de R$: " + reajuste + "e agora ganha R$: " + salario);
		}
		entrada.close();
		

	}

}
