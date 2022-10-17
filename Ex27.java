package comandosLeituraGravacao;

import java.util.Scanner;

//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente.
//O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível
//(álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos clientes;
public class Ex27 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int precoVeiculo;
		double precoComDesconto;
		double total;
		int opcao = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do veiculo");
		precoVeiculo = entrada.nextInt();
		if (precoVeiculo == 0) {
			System.out.println("Valor do veiculo inválido");
			return;
		}
		System.out.println("Irá abastecer com gasolina, alcool ou Diesel? ");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			precoComDesconto = (25 * 100 / precoVeiculo);
			total = precoVeiculo + precoComDesconto;
			System.out.println(precoComDesconto);
			System.out.println("Total: " + total);
			break;
		case 2:
			precoComDesconto = (21 * 100 / precoVeiculo);
			total = precoVeiculo + precoComDesconto;
			System.out.println(precoComDesconto);
			System.out.println("Total: " + total);
			break;
		case 3:
			precoComDesconto = (14 * 100 / precoVeiculo);
			total = precoVeiculo + precoComDesconto;
			System.out.println(precoComDesconto);
			System.out.println("Total: " + total);
			break;

		}

		entrada.close();

	}

}
