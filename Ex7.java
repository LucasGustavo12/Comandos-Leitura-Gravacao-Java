package comandosLeituraGravacao;

import java.util.Scanner;
//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
public class Ex7 {

	public static void main(String[] args) {
		
		float temp, fire;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		temp = entrada.nextFloat();

		fire = (9 * temp) + 160;
		
		System.out.println("A temperatura em fireheight é de : " + fire + "firehight");
		
		entrada.close();
		

	}

}
