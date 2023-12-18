package jogo_de_adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Adivinhador {
	
	public static void main(String[] args) {
		
		
		Random rand = new Random(); 
		Scanner input = new Scanner(System.in);
		int numero = rand.nextInt(100) + 1	;
		int palpiteUsuario;
		int tentativas = 10;
		
		
		
		String menu = """
				========+ Bem vindo ao jogo de adivinhação +========
				||    tente adivinhar um número entre 0 e 100!    ||
				||          (você têm 10 tentativas)              ||                            
				""";
		System.out.println(menu);
		do {
		palpiteUsuario = input.nextInt();

		
		if (palpiteUsuario == numero) {
			
			System.out.println("Paranbéns!! Você acertou :)");
		}else if (palpiteUsuario > numero) {
			System.out.println("Errou! o número é menor, Tente novamente");
			System.out.println(" \ntentativas: " + tentativas);
			tentativas--;
		
		}else if (palpiteUsuario < numero) {
			System.out.println("Errou! o número é maior, Tente novamente");
			System.out.println(" \ntentativas: " + tentativas);
			tentativas--;
		if (tentativas == 0) {
			System.out.println("Fim de jogo :(");
		}
			
		}
		}while (palpiteUsuario != numero || tentativas ==0 );
	}

}
