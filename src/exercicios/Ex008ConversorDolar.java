package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex008ConversorDolar {

    // Crie um programa que leia a cotação do dólar e um valor em reais e imprima o valor convertido em dólares.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        DecimalFormat df = new DecimalFormat ();
        double cotacao = 4.92;

        System.out.println("Insira o valor em reais:");
        double valorReais = input.nextDouble();

        double valorDolar = valorReais * cotacao;

        System.out.println("O valor convertido em dólares é: " + (df.format(valorDolar)) + " USD");

    }
}
