package exercicios;
import java.util.Scanner;

public class Ex06CalculadoraContaAgua {

    //Crie um programa que leia a quantidade de litros de água consumidos por uma residência em um mês e imprima o valor da conta de água (considerando que cada litro de água custa R$0,02).


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de litros de água consumidos por mês:");
        int litrosConsumidos = input.nextInt();

        double custoPorLitro = 0.02;

        double valorContaAgua = litrosConsumidos * custoPorLitro;

        System.out.println("O valor da conta de água é: " + valorContaAgua + " R$");

    }
}
