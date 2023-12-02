package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex005CalculadoraEmprestimo {

    //Crie um programa que leia o valor de um empréstimo, a taxa de juros mensal e o número de meses e imprima o valor da parcela mensal do empréstimo.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do empréstimo:");
        double valorEmprestimo = input.nextDouble();

        System.out.println("Insira a taxa de juros mensal (%):");
        double taxaJurosMensal = input.nextDouble();

        System.out.println("Insira o número de meses:");
        int numeroMeses = input.nextInt();

        double taxaMensal = taxaJurosMensal / 100.0; 
        double parcelaMensal = (valorEmprestimo * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -numeroMeses));
        DecimalFormat df = new	DecimalFormat("#.##");
      
        System.out.println("O valor da parcela mensal do empréstimo é: " +""+ (df.format(parcelaMensal)) + " R$");
        
        

    }
}
