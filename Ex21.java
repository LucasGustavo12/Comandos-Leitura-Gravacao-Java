package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex21 {
//Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório. Informe os totais
	public static void main(String[] args) {
		String nome;
		char sexo; 
		int idade;
		char saude;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.println("Digite o seu sexo M ou F: ");
		sexo = entrada.next().charAt(0);
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println("Qual seu estado de Saúde Digite B para boa, R para ruim: ");
		saude = entrada.next().charAt(0);
		
		if(idade >= 18) {
			System.out.println(nome +" "+sexo +" "+ idade +" " + saude + "aprovado no exercito");
		}else if(idade > 18 && saude == 'b') {
			System.out.println(nome +sexo +" "+ idade+" " + saude +" parabéns você foi aprovado no exercito");
		}else if(saude == 'r') {
			System.out.println(nome +sexo +" "+ idade+" " + saude+ " "+" Você foi reprovado por sua saude não estar boa");
		}
		
		entrada.close();

	}

}
