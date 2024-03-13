package Unidade3;

import java.util.Scanner;
//Balança Restaurante
// 1KG = 1000G
// 1kg / 1000 = Gramas
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        System.out.print("Digite o peso (g): ");
        float preco = peso.nextFloat();
        float precofinal = preco / 1000;
        float valor = precofinal * 25;
        System.out.println("Você deverá pagar R$" + valor);
        peso.close();
    }
}
