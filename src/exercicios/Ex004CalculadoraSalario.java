package exercicios;
import java.util.Scanner;

public class Ex004CalculadoraSalario {

    // Crie um programa que leia o número de horas trabalhadas por um funcionário e o valor da hora de trabalho e imprima o salário bruto desse funcionário.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de horas trabalhadas:");
        double horasTrabalhadas = input.nextDouble();

        System.out.println("Insira o valor da hora de trabalho:");
        double valorHora = input.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;

        System.out.println("O salário bruto do funcionário é: " + salarioBruto + " R$");

    }
}
