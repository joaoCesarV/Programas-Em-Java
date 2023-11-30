package exercicios;
import java.util.Scanner;

public class Ex004CalculadoraSalario {

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
