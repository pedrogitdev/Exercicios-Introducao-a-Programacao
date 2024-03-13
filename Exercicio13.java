package Unidade3;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o comprimento da parede: ");
        float comprimento = input.nextFloat();
        System.out.print("Digite a altura da parede: ");
        float altura = input.nextFloat();
        float area = (comprimento * altura);
        float azulejo = (area * 9);
        double preco = (azulejo * 12.50);
        System.out.println("Para pintar "+ area+ " metros quadrados o preço será de: R$" +preco);
        input.close();
    }
}
