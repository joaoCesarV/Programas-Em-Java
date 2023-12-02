package exercicios;
import java.util.Scanner;

public class Ex007CalculadoraFrete {

	//Crie um programa que leia o peso de uma encomenda (em kg) e imprima o valor do frete (considerando que cada kg custa R$5,00).


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o peso da encomenda em kg:");
        double pesoEncomenda = input.nextDouble();

        double custoPorKg = 5.00;

        double valorFrete = pesoEncomenda * custoPorKg;

        System.out.println("O valor do frete é: " + valorFrete + " R$");

        input.close();
    }
}
			
