package comandosLeituraGravacao;

import java.util.Scanner;

//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
public class Ex17 {

	public static void main(String[] args) {

		int con = 0, num;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 80 números: ");

		for (int i = 1; i < 80; i++) {
			num = entrada.nextInt();

			if (num >= 10 && num <= 150) {
				con++;
				
			}
			
			System.out.println("Foram encontrados " + con + " Números no intervalo entre 10 e 150");
		

		}

		entrada.close();
		
	}
	

}
