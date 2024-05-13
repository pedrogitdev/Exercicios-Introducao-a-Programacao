package Unidade3;

import java.util.Scanner;
    //Análise: Ok
    //Entrada: peso
    //Processo: valor = peso * 25
    //Saída: valor
    //Teste: (peso = 0,5), valor = 12.5
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.print("Digite o peso (kg): ");
        float preco = peso.nextFloat();
        double valor = (preco * 25);
        System.out.println("Você deverá pagar R$" + valor);
        peso.close();
    }
}
