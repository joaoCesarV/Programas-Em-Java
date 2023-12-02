package test;

import java.util.Scanner;

public class Main {


	//Crie um programa que leia o preço à vista de um produto e o número de parcelas e imprima o valor de cada parcela (considerando juros simples de 2% ao mês).

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
