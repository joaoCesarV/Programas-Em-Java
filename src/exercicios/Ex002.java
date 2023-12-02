package exercicios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crie um programa que leia o preço de dois produtos e imprima o valor total da compra.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o preço do primeiro produto: ");
		double primeiroProduto = input.nextDouble();

		System.out.println("Insira o preço do segundo produto: ");
		double segundoProduto = input.nextDouble();
		
		double total = segundoProduto + primeiroProduto;
		
		//formatando para mostar apenas dois números decimais
		String totalFormat = String.format("%.2f", total);
		
		System.out.println("Subtotal: " +totalFormat + "R$");
	}

}
