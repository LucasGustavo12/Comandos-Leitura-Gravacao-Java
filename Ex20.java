package comandosLeituraGravacao;

import java.util.Scanner;

//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros.
//O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%.
//O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral;
public class Ex20 {
	public static void main(String[] args) {
		
		boolean contador = true;
		char continuar;
		double preco;
		double valorDescontoDoze = 0;
		double valorDescontoSete = 0;
		double precoTotal;
		
		Scanner entrada = new Scanner(System.in);
		while (contador == true) {
		System.out.println("Digite o valor do carro");
		preco = entrada.nextDouble();
		if(preco <= 2000) {
			valorDescontoDoze = (12 * 100/ preco);
			precoTotal = preco + valorDescontoDoze;
			System.out.println(" O valor total do veiculo ficou R$: " + precoTotal + " Deseja continuar S ou N: ");
			continuar = entrada.next().charAt(0);
			if(continuar == 's' || continuar == 'S') {
				 contador = true;
			}else {
				contador = false;
			}
		}else if(preco > 2000) {
			valorDescontoSete = (7 * 100 / preco);
			precoTotal = preco + valorDescontoSete;
			System.out.println(" O valor total do veiculo ficou R$: " + precoTotal + " Deseja continuar S ou N: ");
			continuar = entrada.next().charAt(0);
			if(continuar == 's' || continuar == 'S') {
				 contador = true;
			}else {
				contador = false;
			}
		}
		
		}
		

		entrada.close();
		
		
	}
}
