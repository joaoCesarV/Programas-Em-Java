package exercicios;
import java.util.Scanner;

public class Ex007CalculadoraFrete {

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
			