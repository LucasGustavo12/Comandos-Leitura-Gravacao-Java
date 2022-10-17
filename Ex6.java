package comandosLeituraGravacao;

//Leia dois valores para as variáveis A e B,
//e efetuar as trocas dos valores de forma que a variávelApasse a possuir ovalor
//da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores trocados;

public class Ex6 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		
	

	}

}
