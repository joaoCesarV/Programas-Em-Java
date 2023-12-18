package exercicios;

import java.util.Scanner;

public class Ex009CalculadoraPintura {

	/*
	Crie um programa que leia a altura e largura de uma parede (em metros) e 
	imprima a área da parede e a quantidade de tinta necessária para pintá-la (considerando que cada litro de tinta pinta 2m²).
	Fórmula para cálculo de área: 
	int area = alturaDaParede * larguraDaParede;
	*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		    System.out.print("Digite a largura da parede em metros: ");
        double largura = input.nextDouble();
      
        System.out.print("Digite a altura da parede em metros: ");
        double altura = input.nextDouble();
        
        double area = altura * largura;
        
        double tintaCobertura = 2.0;
        double tintaQuantitade = area / tintaCobertura;
        
        System.out.println("A área da parade é: " +area +"m²");
        System.out.println("Tinta necessária: " + tintaQuantitade + " litros");
    }
}
