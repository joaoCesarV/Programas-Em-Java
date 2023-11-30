package exercicios;
import java.util.Scanner;

public class Ex003CalculadoraVelocidadeMedia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a distância percorrida pelo carro em km:");
        double distancia = input.nextDouble();

        System.out.println("Insira o tempo gasto em horas:");
        double tempo = input.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("A velocidade média do carro é: " + velocidadeMedia + " km/h");

    }
}