package exercicios;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		// Crie um programa que leia o nome do usuário e imprima uma saudação
		// personalizada:

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome de usuário: ");
		String nome = input.nextLine();

		System.out.println("Olá, " + nome + " Bem-vindo ao nosso programa!	");

	}

}
