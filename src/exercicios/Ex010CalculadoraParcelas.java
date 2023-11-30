package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o preço do produto desejado: ");
		double produtoVista = input.nextDouble();
		
		System.out.println("Insira em quantas parcelas será peago: ");
		int parcelas = input.nextInt();
		
		double valorParcela = produtoVista / parcelas; 
		
		double juros = 0.2;
		
		double valorParcelaFinal = valorParcela *  (1 +juros);
		
		System.out.println("O valor das parcelas é: " + valorParcelaFinal);
		
		
	}
}
