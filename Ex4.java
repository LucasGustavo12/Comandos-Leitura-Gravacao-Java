package comandosLeituraGravacao;

import java.util.Scanner;

//Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês
//(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês;

public class Ex4 {

	public static void main(String[] args) {
		
		String nome;
		float salario;
		int vendas;
		float comissao;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do vendedor: ");
		nome = entrada.nextLine();
		System.out.println("Informe o salário: ");
		salario = entrada.nextFloat();
		System.out.println("Informe a quantidade de vendas: ");
		vendas = entrada.nextInt();
		
		comissao = salario * 0.15f;
		
		float salarioFixo = salario + comissao;
		
		System.out.println(nome + vendas + " vendas" + "R$ " + salarioFixo);
		
		entrada.close();
	}

}
