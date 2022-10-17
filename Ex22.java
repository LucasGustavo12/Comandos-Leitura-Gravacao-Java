package comandosLeituraGravacao;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		String nomeProduto = "";
		float precoCusto = 0.0f;
		float precoVenda = 0.0f;
		
		float totalCusto = 0.0f;
		float totalVenda = 0.0f;
		
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 40; i++) {
			System.out.println("Digite o nome do produto");
			nomeProduto = entrada.nextLine();
			
			System.out.println("Digite o preco de custo do produto");
			precoCusto = entrada.nextFloat();
			
			
			System.out.println("Digite o preco de venda do produto");
			precoVenda = entrada.nextFloat();
			
			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;
			
			if(precoCusto == precoVenda) {
				System.out.println("Houve empate entre preco de custo e venda");
			}else if(precoCusto > precoVenda) {
				System.out.println("Prejuizo");
			}else if(precoCusto < precoVenda) {
				System.out.println("Lucro");
			}
		}

		System.out.println(nomeProduto + ", preço do custo " + precoCusto + ", preco de venda = " + precoVenda);
		
		entrada.close();
	}
	
	

}
